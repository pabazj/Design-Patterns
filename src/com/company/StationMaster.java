package com.company;

public class StationMaster {

    private Station kelaniValleytLine;
    private Station coastalLine;
    private Station puttalamaLine;
    private Station mainLine;

    public StationMaster() {
        kelaniValleytLine = new KelaniValleytLine();
        coastalLine = new CoastalLine();
        puttalamaLine = new PuttalamaLine();
        mainLine = new MainLine();
    }

    public void kelaniValleytLineTiketIssue(){
        kelaniValleytLine.selectDestination();
        kelaniValleytLine.ticketPrice();
    }
    public void coastalLineTiketIssue(){
        coastalLine.selectDestination();
        coastalLine.ticketPrice();
    }
    public void puttalamaLineTiketIssue(){
        puttalamaLine.selectDestination();
        puttalamaLine.ticketPrice();
    }
    public void mainLineTiketIssue(){
        mainLine.selectDestination();
        mainLine.ticketPrice();
    }
}
