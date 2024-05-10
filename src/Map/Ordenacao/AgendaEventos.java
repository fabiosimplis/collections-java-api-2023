package Map.Ordenacao;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public Evento obterProximoEvento() {
        LocalDate dateProximoEvento = LocalDate.MAX;
        LocalDate dateDeHoje = LocalDate.now();
        Evento proximoEvento = null;
        if (!eventosMap.isEmpty()){
            for (LocalDate date : eventosMap.keySet()){
                if (date.isAfter(dateDeHoje) && date.isBefore(dateProximoEvento)){
                    dateProximoEvento = date;
                }
            }
            proximoEvento = eventosMap.get(dateProximoEvento);
        }
        return proximoEvento;
    }

    public Evento obterProximoEventoTreeMap() {
        Map<LocalDate, Evento> eventoTreemap = new TreeMap<>(eventosMap);
        LocalDate dateDeHoje = LocalDate.now();
        Evento proximoEvento = null;
        if (!eventosMap.isEmpty()){
            for (Map.Entry<LocalDate, Evento> entry : eventoTreemap.entrySet()){
                if (entry.getKey().isAfter(dateDeHoje)){
                    proximoEvento = entry.getValue();
                    break;
                }
            }
        }
        return proximoEvento;
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        ;
        System.out.println("HashMap\n" + agendaEventos.obterProximoEvento());
        System.out.println("TreeMap\n" + agendaEventos.obterProximoEventoTreeMap());
    }
}
