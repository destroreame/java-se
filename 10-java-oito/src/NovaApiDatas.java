import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovaApiDatas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasDoRio = LocalDate.of(2016, Month.JUNE, 5);
        int anos = olimpiadasDoRio.getYear() - hoje.getYear();
        System.out.println(anos);

        LocalDate dataFuturo = LocalDate.of(2022, Month.JUNE, 27);
        Period periodo = Period.between(hoje, dataFuturo);
        System.out.println(periodo.getDays());

        LocalDate proximasOlimpiadas = olimpiadasDoRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15,30);
        System.out.println(intervalo);
    }
}
