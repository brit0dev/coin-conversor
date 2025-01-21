public class Converter {
    public Conversion getRates(String baseCoin){
        Conversion coinRates = new API().getConversion(baseCoin);
        return coinRates;
    }

    public double ARSToUSD(double value){
        Conversion coinRates = this.getRates("ARS");
        return value * coinRates.conversion_rates().USD;
    }

    public double USDToARS(double value){
        Conversion coinRates = this.getRates("USD");
        return value * coinRates.conversion_rates().ARS;
    }

    public double USDToBRL(double value){
            Conversion coinRates = this.getRates("USD");
            return value * coinRates.conversion_rates().BRL;
    }

    public double BRLToUSD(double value){
        Conversion coinRates = this.getRates("BRL");
        return value * coinRates.conversion_rates().USD;
    }

    public double USDToCOP(double value){
        Conversion coinRates = this.getRates("USD");
        return value * coinRates.conversion_rates().COP;
    }

    public double COPToUSD(double value){
        Conversion coinRates = this.getRates("COP");
        return value * coinRates.conversion_rates().USD;
    }
}
