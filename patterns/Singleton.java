class Sun {
    private static Sun instance;
    public Sun getInstance(){
        if(instance == null) instance = new Sun();
        return instance;
    }
    private Sun(){};
}