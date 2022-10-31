package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoGame {
    private static final int TICKET_PRICE = 1000;

    public static List<LottoTicket> buy(final int moneyToBuyTicket) {
        List<LottoTicket> tickets = new ArrayList<>();

        for (int i = 0; i < numberOfTickets(moneyToBuyTicket); i++) {
            tickets.add(new LottoTicket());
        }

        return tickets;
    }

    private static int numberOfTickets(final int moneyToBuyTicket) {
        return moneyToBuyTicket / TICKET_PRICE;
    }

}