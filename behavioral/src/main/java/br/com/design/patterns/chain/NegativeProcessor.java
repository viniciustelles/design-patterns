package br.com.design.patterns.chain;

class NegativeProcessor extends ValidatorProcessor {

    public NegativeProcessor(ValidatorProcessor nextProcessor) {
        super(nextProcessor);

    }
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}