package org.example;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        /* chamada único de método no main,
        * sendo que as outras funções são
        * chamadas através do openFile
        */
        openFile();
    }



    /* método para imprimir o texto completo do
    * documento, caso solicitado pelo usuário
    */
    public static void option5(String[]lines) {
        for (String l : lines) {
            System.out.println(l);
        }
    }


    /* overloading no método print
    * o primeiro têm a função de imprimir os dados
    * inseridos em apenas uma linha, enquanto o segundo
    * consegue tratar os dados que estão em mais de uma linha
    */
    public static void print(int lineNumber, String[]lines) {
        String l, sub;
        /* a variávei l terá o valor do número
        * da linha proveniente da operação
        * que o usuário deseja realizar
         */
        l = lines[lineNumber - 1];
        /* a variável sub, que será impressa,
        * terá o tamnho de 0 até o comprimento
        * da linha escolhida
         */
        sub = l.substring(0,l.length());
        System.out.println(sub);
    }
    public static void print(List<Integer> lineNumber, String[]lines) {

        String l, sub;
        List<String> sentences = new ArrayList<>();
        /* for-each para pegar mais de uma
        * linha, caso a informação esteja
        * contida de forma dividida
         */
        for (int ln : lineNumber) {
            l = lines[ln - 1];
            sub = l.substring(0,l.length());
            sentences.add(sub);
        }
        for (String phrase : sentences) {
            System.out.println(phrase);
        }
    }

    /* método que dá toda a estrutura ao
    * programa
     */
    public static void optionsBody(String[]lines){
        Scanner sc = new Scanner(System.in);
        /* inicialização de variáveis */
        int choose = 0, lineNumber;
        List<Integer> list = new ArrayList<>();
        List<Integer> values = new ArrayList<>(Arrays.asList(4,5,6,7,8,9,10,11));
        /* laço de repetição dependente da escolha
        * do usuário
         */
        while(choose!=6) {
            System.out.println("\nSelecione o que você deseja ver: \n" +
                    "1 -> Identificação do extrato \n" +
                    "2 -> Dados da conta debitada \n" +
                    "3 -> Dados do pagamento\n" +
                    "4 -> Data da operação efetuada\n" +
                    "5 -> Todas as informações do documento \n" +
                    "6 -> Sair do sistema");
            choose = sc.nextInt();
            if(choose < 1 || choose > 6) {
                throw new RuntimeException("Opção inexistente!");
            }
            /* switch-case para fornecer as informações
            * solicitadas pelo usuário
             */
            switch (choose) {
                case 1:
                    /* atualização do número da linha onde
                    * contém a informação desejada e impressão
                    * do código através da chamada do método
                    * print
                     */
                    lineNumber = 3;
                    print(lineNumber,lines);
                    break;
                case 2:
                    /*laço de repetição para inserção
                    * do números das linhas que contêm
                    * as informações solicitadas no momento
                     */
                    for(int i = 0; i < 3; i ++) {
                        list.add(values.get(i));
                    }
                    print(list,lines);
                    list.clear();
                    break;
                case 3:
                    for(int i = 3; i < values.size(); i ++) {
                        list.add(values.get(i));
                    }
                    print(list,lines);
                    break;
                case 4:
                    lineNumber = 12;
                    print(lineNumber,lines);
                    break;
                case 5:
                    /* chamada de método para impressão de
                    * todas as informações do documento
                     */
                    option5(lines);
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar!");
            }
        }
    }



    /* método chamado diretamente pelo main
    * e trata a abertura de arquivo pdf
    * utilizando Apache PDFBox e suas classes
     */
    public static void openFile() {
        /* o caminho do arquivo será fornecido
        * pelo usuário
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Seja bem-vindo! Digite o caminho do arquivo: ");
        String strPath = sc.next();
        try (PDDocument document = PDDocument.load( new File(strPath))) {

            /*condicional para verificar se o método está
            criptografado
             */
            if (!document.isEncrypted()) {

                /*variável da classe que coleta os textos
                de determinada área no pdf
                 */
                PDFTextStripperByArea s = new PDFTextStripperByArea();
                s.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                /*variável que transfomra o documento em texto */
                String pdfFileInText = tStripper.getText(document);
                /*vetor de string criado onde cada linha
                * se torna uma posição
                 */
                String lines[] = pdfFileInText.split("\\r?\\n");

                /*chamada do método que realiza as operações*/
                optionsBody(lines);

            }
        }
        /* tratamento de exceções */
        catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! ");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}