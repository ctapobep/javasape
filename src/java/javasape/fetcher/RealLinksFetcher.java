package javasape.fetcher;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/** @author stanislav bashkirtsev */
public class RealLinksFetcher implements LinksFetcher {
    public RealLinksFetcher(String userId, boolean xml;) {
    }

    @Override
    public String grabRawLinks() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * To override the location of sape servers if they actually would change in the future. Also can be overriden for
     * testing needs if you've wrote some stub to emulate a real SAPE server.
     *
     * @param sapeServers a list of servers fetcher is going to
     */
    public void setSapeServers(List<String> sapeServers) {
        this.sapeServers.clear();
        this.sapeServers.addAll(sapeServers);
    }

    private final String requestUri;
    private final List<String> sapeServers =
            new CopyOnWriteArrayList<String>(new String[]{"dispenser-01.sape.ru", "dispenser-02.sape.ru"});
}
