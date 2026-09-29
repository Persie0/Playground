package gl;

import dm.C5207g;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import sl.C9072e;

/* JADX INFO: renamed from: gl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5818a {

    /* JADX INFO: renamed from: a */
    public DataInputStream f35123a;

    /* JADX INFO: renamed from: b */
    public DataOutputStream f35124b;

    /* JADX INFO: renamed from: c */
    public final Object f35125c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f35126d;

    /* JADX INFO: renamed from: e */
    public final Socket f35127e;

    public C5818a() {
        this(0);
    }

    public C5818a(int i10) {
        Socket socket = new Socket();
        this.f35127e = socket;
        this.f35125c = new Object();
        if (socket.isConnected() && !socket.isClosed()) {
            this.f35123a = new DataInputStream(socket.getInputStream());
            this.f35124b = new DataOutputStream(socket.getOutputStream());
        }
        if (socket.isClosed()) {
            this.f35126d = true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m12224a() {
        synchronized (this.f35125c) {
            if (!this.f35126d) {
                this.f35126d = true;
                try {
                    DataInputStream dataInputStream = this.f35123a;
                    if (dataInputStream == null) {
                        C5207g.m11117l("dataInput");
                        throw null;
                    }
                    dataInputStream.close();
                    try {
                        DataOutputStream dataOutputStream = this.f35124b;
                        if (dataOutputStream == null) {
                            C5207g.m11117l("dataOutput");
                            throw null;
                        }
                        dataOutputStream.close();
                        try {
                            this.f35127e.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m12225b() throws Exception {
        if (this.f35126d) {
            throw new Exception("FetchFileResourceTransporter is already closed.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m12226c() throws Exception {
        DataInputStream dataInputStream = this.f35123a;
        if (dataInputStream == null) {
            C5207g.m11117l("dataInput");
            throw null;
        }
        if (dataInputStream != null) {
            DataOutputStream dataOutputStream = this.f35124b;
            if (dataOutputStream == null) {
                C5207g.m11117l("dataOutput");
                throw null;
            }
            if (dataOutputStream != null) {
                return;
            }
        }
        throw new Exception("You forgot to call connect before calling this method.");
    }
}
