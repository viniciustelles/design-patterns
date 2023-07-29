package br.com.design.patterns.chain;

class PositiveProcessor extends ValidatorProcessor {

    public PositiveProcessor(ValidatorProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}