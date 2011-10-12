import java.net.Socket;

/**
 * Data Class to represent Connection of Peer with other Peers
 * @author sreenidhi
 *
 */
public class Connection {
	/*
	 * _ID of the peer to whom this connection belongs.
	 */
	private String _peerID;
    /*
     * Represents uploadRate of Peer 
     * associate with the Connection
     */
	private int _uploadRate;
	
	/*
	 * Represents the downloadRate of 
	 * Peer associated with the Connection
	 */
	private int _downloadRate;
	
	/*
	 * The Socket through which other Peers
	 * can communicate.
	 */
	private Socket _peerSocket;
	
	/*
	 * To identify if the Peer represented by this Connection
	 * is choked or not
	 */
	private Boolean choked;
	/*
	 * Represents Host Address of the Connection.
	 */
	private String _host;
	/*
	 * Listening port of the Host.
	 */
	private int  _port;
	/*
	 * Indicates whether this Connection has complete File or not.
	 */
	private Boolean _hasCompleteFile;
	
	public Connection(String _peerID, String _host, int _port, Boolean _hasCompleteFile) {
		this._peerID = _peerID;
		this._host = _host;
		this._port = _port;
		this._hasCompleteFile = _hasCompleteFile;
		this._peerSocket = null;
	}
	/**
	 * @return the _peerID
	 */
	public String get_peerID() {
		return _peerID;
	}
	/**
	 * @param peerID the _peerID to set
	 */
	public void set_peerID(String peerID) {
		_peerID = peerID;
	}
	/**
	 * @return the _uploadRate
	 */
	public int get_uploadRate() {
		return _uploadRate;
	}
	/**
	 * @param uploadRate the _uploadRate to set
	 */
	public void set_uploadRate(int uploadRate) {
		_uploadRate = uploadRate;
	}
	/**
	 * @return the _downloadRate
	 */
	public int get_downloadRate() {
		return _downloadRate;
	}
	/**
	 * @param downloadRate the _downloadRate to set
	 */
	public void set_downloadRate(int downloadRate) {
		_downloadRate = downloadRate;
	}
	/**
	 * @return the _peerSocket
	 */
	public Socket get_peerSocket() {
		return _peerSocket;
	}
	/**
	 * @param peerSocket the _peerSocket to set
	 */
	public void set_peerSocket(Socket peerSocket) {
		_peerSocket = peerSocket;
	}
	/**
	 * @return the choked
	 */
	public Boolean getChoked() {
		return choked;
	}
	/**
	 * @param choked the choked to set
	 */
	public void setChoked(Boolean choked) {
		this.choked = choked;
	}
	/**
	 * @return the _host
	 */
	public String get_host() {
		return _host;
	}
	/**
	 * @param host the _host to set
	 */
	public void set_host(String host) {
		_host = host;
	}
	/**
	 * @return the _port
	 */
	public int get_port() {
		return _port;
	}
	/**
	 * @param port the _port to set
	 */
	public void set_port(int port) {
		_port = port;
	}
	/**
	 * @return the _hasCompleteFile
	 */
	public Boolean get_hasCompleteFile() {
		return _hasCompleteFile;
	}
	/**
	 * @param hasCompleteFile the _hasCompleteFile to set
	 */
	public void set_hasCompleteFile(Boolean hasCompleteFile) {
		_hasCompleteFile = hasCompleteFile;
	}
	
	
	
}
