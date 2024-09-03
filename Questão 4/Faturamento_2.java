public class Main
{
	public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double sp_percent = (sp / total) * 100;
        double rj_percent = (rj / total) * 100;
        double mg_percent = (mg / total) * 100;
        double es_percent = (es / total) * 100;
        double outros_percent = (outros / total) * 100;

        System.out.printf("Percentual de representação de cada estado no faturamento mensal:\n");
        System.out.printf("SP: %.2f%%\n", sp_percent);
        System.out.printf("RJ: %.2f%%\n", rj_percent);
        System.out.printf("MG: %.2f%%\n", mg_percent);
        System.out.printf("ES: %.2f%%\n", es_percent);
        System.out.printf("Outros: %.2f%%\n", outros_percent);
    }
}
