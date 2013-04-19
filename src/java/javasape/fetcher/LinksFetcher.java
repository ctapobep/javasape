package javasape.fetcher;

/**
 * Just fetches a remote page from SAPE servers with links to be shown on the page.
 *
 * @author stanislav bashkirtsev
 */
public interface LinksFetcher {
    /**
     * Downloads the links from remote host.
     *
     * @return a textual representation of what SAPE server responded
     */
    String grabRawLinks();
}
