package p467wo;

import dm.C5207g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.internal.connection.C8077a;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p290o6.C7967l0;
import p385sf.C9000b;
import sl.C9072e;
import so.AbstractC9093k;
import so.C9082a;
import so.C9083a0;
import so.C9096n;
import tl.C9327o;
import to.C9347b;

/* JADX INFO: renamed from: wo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9989d {

    /* JADX INFO: renamed from: a */
    public final C9991f f50758a;

    /* JADX INFO: renamed from: b */
    public final C9082a f50759b;

    /* JADX INFO: renamed from: c */
    public final C9990e f50760c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9093k f50761d;

    /* JADX INFO: renamed from: e */
    public C9992g.a f50762e;

    /* JADX INFO: renamed from: f */
    public C9992g f50763f;

    /* JADX INFO: renamed from: g */
    public int f50764g;

    /* JADX INFO: renamed from: h */
    public int f50765h;

    /* JADX INFO: renamed from: i */
    public int f50766i;

    /* JADX INFO: renamed from: j */
    public C9083a0 f50767j;

    public C9989d(C9991f c9991f, C9082a c9082a, C9990e c9990e, AbstractC9093k abstractC9093k) {
        C5207g.m11111f(c9991f, "connectionPool");
        C5207g.m11111f(abstractC9093k, "eventListener");
        this.f50758a = c9991f;
        this.f50759b = c9082a;
        this.f50760c = c9990e;
        this.f50761d = abstractC9093k;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:126:0x0280  */
    /* JADX WARN: Code duplicated, block: B:128:0x028c  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:141:0x0314  */
    /* JADX WARN: Code duplicated, block: B:182:0x0315 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0263 A[EDGE_INSN: B:210:0x0263->B:121:0x0263 BREAK  A[LOOP:1: B:55:0x00d9->B:212:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162  */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:87:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x017b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0183  */
    /* JADX WARN: Code duplicated, block: B:92:0x0192  */
    /* JADX WARN: Code duplicated, block: B:93:0x019b  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bd A[LOOP:3: B:96:0x01b7->B:98:0x01bd, LOOP_END] */
    /* JADX INFO: renamed from: a */
    public final C8077a m18566a(int i10, int i11, int i12, boolean z10, boolean z11) throws IOException {
        C9083a0 c9083a0;
        C9992g.a aVar;
        C9992g c9992g;
        ArrayList arrayList;
        boolean z12;
        C9992g.a aVar2;
        boolean z13;
        C9082a c9082a;
        Proxy proxy;
        ArrayList arrayList2;
        String hostAddress;
        int port;
        boolean z14;
        List<InetAddress> listMo16803b;
        Iterator<InetAddress> it;
        Iterator<? extends InetSocketAddress> it2;
        C9083a0 c9083a1;
        C7967l0 c7967l0;
        boolean zContains;
        C8077a c8077a;
        C7967l0 c7967l1;
        C9083a0 c9083a2;
        Socket socketM18577j;
        while (!this.f50760c.f50771K) {
            C8077a c8077a2 = this.f50760c.f50783j;
            if (c8077a2 != null) {
                synchronized (c8077a2) {
                    socketM18577j = (c8077a2.f43876j || !m18567b(c8077a2.f43868b.f47381a.f47378i)) ? this.f50760c.m18577j() : null;
                    C9072e c9072e = C9072e.f47360a;
                }
                if (this.f50760c.f50783j != null) {
                    if (!(socketM18577j == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (socketM18577j != null) {
                        C9347b.m17698e(socketM18577j);
                    }
                    AbstractC9093k abstractC9093k = this.f50761d;
                    C9990e c9990e = this.f50760c;
                    abstractC9093k.getClass();
                    C5207g.m11111f(c9990e, "call");
                    this.f50764g = 0;
                    this.f50765h = 0;
                    this.f50766i = 0;
                    if (this.f50758a.m18578a(this.f50759b, this.f50760c, null, false)) {
                        c8077a2 = this.f50760c.f50783j;
                        C5207g.m11108c(c8077a2);
                        AbstractC9093k abstractC9093k2 = this.f50761d;
                        C9990e c9990e2 = this.f50760c;
                        abstractC9093k2.getClass();
                        C5207g.m11111f(c9990e2, "call");
                    } else {
                        c9083a0 = this.f50767j;
                        try {
                            if (c9083a0 != null) {
                                this.f50767j = null;
                            } else {
                                aVar = this.f50762e;
                                if (aVar == null && aVar.m18581a()) {
                                    C9992g.a aVar3 = this.f50762e;
                                    C5207g.m11108c(aVar3);
                                    if (!aVar3.m18581a()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i13 = aVar3.f50806b;
                                    aVar3.f50806b = i13 + 1;
                                    c9083a0 = aVar3.f50805a.get(i13);
                                } else {
                                    c9992g = this.f50763f;
                                    if (c9992g == null) {
                                        C9082a c9082a2 = this.f50759b;
                                        C9990e c9990e3 = this.f50760c;
                                        c9992g = new C9992g(c9082a2, c9990e3.f50774a.f47507U, c9990e3, this.f50761d);
                                        this.f50763f = c9992g;
                                    }
                                    if (c9992g.m18580a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    do {
                                        if (c9992g.f50802f < c9992g.f50801e.size()) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            break;
                                        }
                                        if (c9992g.f50802f < c9992g.f50801e.size()) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        c9082a = c9992g.f50797a;
                                        if (z13) {
                                            throw new SocketException("No route to " + c9082a.f47378i.f47458d + "; exhausted proxy configurations: " + c9992g.f50801e);
                                        }
                                        List<? extends Proxy> list = c9992g.f50801e;
                                        int i14 = c9992g.f50802f;
                                        c9992g.f50802f = i14 + 1;
                                        proxy = list.get(i14);
                                        arrayList2 = new ArrayList();
                                        c9992g.f50803g = arrayList2;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            C9096n c9096n = c9082a.f47378i;
                                            hostAddress = c9096n.f47458d;
                                            port = c9096n.f47459e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(C5207g.m11116k(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                                            }
                                            C5207g.m11110e(socketAddressAddress, "proxyAddress");
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                C5207g.m11110e(hostAddress, "hostName");
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                C5207g.m11110e(hostAddress, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            z14 = false;
                                        } else {
                                            z14 = true;
                                        }
                                        if (z14) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            byte[] bArr = C9347b.f48082a;
                                            C5207g.m11111f(hostAddress, "<this>");
                                            if (C9347b.f48087f.m14271b(hostAddress)) {
                                                listMo16803b = C9000b.m17251q(InetAddress.getByName(hostAddress));
                                            } else {
                                                c9992g.f50800d.getClass();
                                                C5207g.m11111f(c9992g.f50799c, "call");
                                                listMo16803b = c9082a.f47370a.mo16803b(hostAddress);
                                                if (listMo16803b.isEmpty()) {
                                                    throw new UnknownHostException(c9082a.f47370a + " returned no addresses for " + hostAddress);
                                                }
                                            }
                                            it = listMo16803b.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress(it.next(), port));
                                            }
                                        }
                                        it2 = c9992g.f50803g.iterator();
                                        while (it2.hasNext()) {
                                            c9083a1 = new C9083a0(c9992g.f50797a, proxy, it2.next());
                                            c7967l0 = c9992g.f50798b;
                                            synchronized (c7967l0) {
                                                zContains = ((Set) c7967l0.f43382a).contains(c9083a1);
                                            }
                                            if (zContains) {
                                                c9992g.f50804h.add(c9083a1);
                                            } else {
                                                arrayList.add(c9083a1);
                                            }
                                        }
                                    } while (!(!arrayList.isEmpty()));
                                    if (arrayList.isEmpty()) {
                                        C9327o.m17684D(c9992g.f50804h, arrayList);
                                        c9992g.f50804h.clear();
                                    }
                                    aVar2 = new C9992g.a(arrayList);
                                    this.f50762e = aVar2;
                                    if (!this.f50760c.f50771K) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f50758a.m18578a(this.f50759b, this.f50760c, arrayList, false)) {
                                        c8077a2 = this.f50760c.f50783j;
                                        C5207g.m11108c(c8077a2);
                                        AbstractC9093k abstractC9093k3 = this.f50761d;
                                        C9990e c9990e4 = this.f50760c;
                                        abstractC9093k3.getClass();
                                        C5207g.m11111f(c9990e4, "call");
                                    } else {
                                        if (aVar2.m18581a()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i15 = aVar2.f50806b;
                                        aVar2.f50806b = i15 + 1;
                                        c9083a0 = (C9083a0) arrayList.get(i15);
                                        c8077a = new C8077a(this.f50758a, c9083a0);
                                        this.f50760c.f50773M = c8077a;
                                        c8077a.m15972c(i10, i11, i12, z10, this.f50760c, this.f50761d);
                                        this.f50760c.f50773M = null;
                                        c7967l1 = this.f50760c.f50774a.f47507U;
                                        c9083a2 = c8077a.f43868b;
                                        synchronized (c7967l1) {
                                            C5207g.m11111f(c9083a2, "route");
                                            ((Set) c7967l1.f43382a).remove(c9083a2);
                                        }
                                        if (this.f50758a.m18578a(this.f50759b, this.f50760c, arrayList, true)) {
                                            C8077a c8077a3 = this.f50760c.f50783j;
                                            C5207g.m11108c(c8077a3);
                                            this.f50767j = c9083a0;
                                            Socket socket = c8077a.f43870d;
                                            C5207g.m11108c(socket);
                                            C9347b.m17698e(socket);
                                            AbstractC9093k abstractC9093k4 = this.f50761d;
                                            C9990e c9990e5 = this.f50760c;
                                            abstractC9093k4.getClass();
                                            C5207g.m11111f(c9990e5, "call");
                                            c8077a2 = c8077a3;
                                        } else {
                                            synchronized (c8077a) {
                                                C9991f c9991f = this.f50758a;
                                                c9991f.getClass();
                                                byte[] bArr2 = C9347b.f48082a;
                                                c9991f.f50795e.add(c8077a);
                                                c9991f.f50793c.m18258c(c9991f.f50794d, 0L);
                                                this.f50760c.m18570c(c8077a);
                                                C9072e c9072e2 = C9072e.f47360a;
                                            }
                                            AbstractC9093k abstractC9093k5 = this.f50761d;
                                            C9990e c9990e6 = this.f50760c;
                                            abstractC9093k5.getClass();
                                            C5207g.m11111f(c9990e6, "call");
                                            c8077a2 = c8077a;
                                        }
                                    }
                                }
                            }
                            c8077a.m15972c(i10, i11, i12, z10, this.f50760c, this.f50761d);
                            this.f50760c.f50773M = null;
                            c7967l1 = this.f50760c.f50774a.f47507U;
                            c9083a2 = c8077a.f43868b;
                            synchronized (c7967l1) {
                                C5207g.m11111f(c9083a2, "route");
                                ((Set) c7967l1.f43382a).remove(c9083a2);
                                if (this.f50758a.m18578a(this.f50759b, this.f50760c, arrayList, true)) {
                                    C8077a c8077a4 = this.f50760c.f50783j;
                                    C5207g.m11108c(c8077a4);
                                    this.f50767j = c9083a0;
                                    Socket socket2 = c8077a.f43870d;
                                    C5207g.m11108c(socket2);
                                    C9347b.m17698e(socket2);
                                    AbstractC9093k abstractC9093k6 = this.f50761d;
                                    C9990e c9990e7 = this.f50760c;
                                    abstractC9093k6.getClass();
                                    C5207g.m11111f(c9990e7, "call");
                                    c8077a2 = c8077a4;
                                } else {
                                    synchronized (c8077a) {
                                        C9991f c9991f2 = this.f50758a;
                                        c9991f2.getClass();
                                        byte[] bArr3 = C9347b.f48082a;
                                        c9991f2.f50795e.add(c8077a);
                                        c9991f2.f50793c.m18258c(c9991f2.f50794d, 0L);
                                        this.f50760c.m18570c(c8077a);
                                        C9072e c9072e3 = C9072e.f47360a;
                                        AbstractC9093k abstractC9093k7 = this.f50761d;
                                        C9990e c9990e8 = this.f50760c;
                                        abstractC9093k7.getClass();
                                        C5207g.m11111f(c9990e8, "call");
                                        c8077a2 = c8077a;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f50760c.f50773M = null;
                            throw th2;
                        }
                        arrayList = null;
                        c8077a = new C8077a(this.f50758a, c9083a0);
                        this.f50760c.f50773M = c8077a;
                    }
                }
            } else {
                this.f50764g = 0;
                this.f50765h = 0;
                this.f50766i = 0;
                if (this.f50758a.m18578a(this.f50759b, this.f50760c, null, false)) {
                    c8077a2 = this.f50760c.f50783j;
                    C5207g.m11108c(c8077a2);
                    AbstractC9093k abstractC9093k8 = this.f50761d;
                    C9990e c9990e9 = this.f50760c;
                    abstractC9093k8.getClass();
                    C5207g.m11111f(c9990e9, "call");
                } else {
                    c9083a0 = this.f50767j;
                    if (c9083a0 != null) {
                        this.f50767j = null;
                    } else {
                        aVar = this.f50762e;
                        if (aVar == null) {
                        }
                        c9992g = this.f50763f;
                        if (c9992g == null) {
                            C9082a c9082a3 = this.f50759b;
                            C9990e c9990e10 = this.f50760c;
                            c9992g = new C9992g(c9082a3, c9990e10.f50774a.f47507U, c9990e10, this.f50761d);
                            this.f50763f = c9992g;
                        }
                        if (c9992g.m18580a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        do {
                            if (c9992g.f50802f < c9992g.f50801e.size()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                break;
                                break;
                            }
                            if (c9992g.f50802f < c9992g.f50801e.size()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            c9082a = c9992g.f50797a;
                            if (z13) {
                                throw new SocketException("No route to " + c9082a.f47378i.f47458d + "; exhausted proxy configurations: " + c9992g.f50801e);
                            }
                            List<? extends Proxy> list2 = c9992g.f50801e;
                            int i16 = c9992g.f50802f;
                            c9992g.f50802f = i16 + 1;
                            proxy = list2.get(i16);
                            arrayList2 = new ArrayList();
                            c9992g.f50803g = arrayList2;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                C9096n c9096n2 = c9082a.f47378i;
                                hostAddress = c9096n2.f47458d;
                                port = c9096n2.f47459e;
                            } else {
                                C9096n c9096n3 = c9082a.f47378i;
                                hostAddress = c9096n3.f47458d;
                                port = c9096n3.f47459e;
                            }
                            if (1 <= port) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                            } else {
                                byte[] bArr4 = C9347b.f48082a;
                                C5207g.m11111f(hostAddress, "<this>");
                                if (C9347b.f48087f.m14271b(hostAddress)) {
                                    listMo16803b = C9000b.m17251q(InetAddress.getByName(hostAddress));
                                } else {
                                    c9992g.f50800d.getClass();
                                    C5207g.m11111f(c9992g.f50799c, "call");
                                    listMo16803b = c9082a.f47370a.mo16803b(hostAddress);
                                    if (listMo16803b.isEmpty()) {
                                        throw new UnknownHostException(c9082a.f47370a + " returned no addresses for " + hostAddress);
                                    }
                                }
                                it = listMo16803b.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new InetSocketAddress(it.next(), port));
                                }
                            }
                            it2 = c9992g.f50803g.iterator();
                            while (it2.hasNext()) {
                                c9083a1 = new C9083a0(c9992g.f50797a, proxy, it2.next());
                                c7967l0 = c9992g.f50798b;
                                synchronized (c7967l0) {
                                    zContains = ((Set) c7967l0.f43382a).contains(c9083a1);
                                    if (zContains) {
                                        c9992g.f50804h.add(c9083a1);
                                    } else {
                                        arrayList.add(c9083a1);
                                    }
                                }
                            }
                        } while (!(!arrayList.isEmpty()));
                        if (arrayList.isEmpty()) {
                            C9327o.m17684D(c9992g.f50804h, arrayList);
                            c9992g.f50804h.clear();
                        }
                        aVar2 = new C9992g.a(arrayList);
                        this.f50762e = aVar2;
                        if (!this.f50760c.f50771K) {
                            throw new IOException("Canceled");
                        }
                        if (this.f50758a.m18578a(this.f50759b, this.f50760c, arrayList, false)) {
                            c8077a2 = this.f50760c.f50783j;
                            C5207g.m11108c(c8077a2);
                            AbstractC9093k abstractC9093k9 = this.f50761d;
                            C9990e c9990e11 = this.f50760c;
                            abstractC9093k9.getClass();
                            C5207g.m11111f(c9990e11, "call");
                        } else {
                            if (aVar2.m18581a()) {
                                throw new NoSuchElementException();
                            }
                            int i17 = aVar2.f50806b;
                            aVar2.f50806b = i17 + 1;
                            c9083a0 = (C9083a0) arrayList.get(i17);
                            c8077a = new C8077a(this.f50758a, c9083a0);
                            this.f50760c.f50773M = c8077a;
                            c8077a.m15972c(i10, i11, i12, z10, this.f50760c, this.f50761d);
                            this.f50760c.f50773M = null;
                            c7967l1 = this.f50760c.f50774a.f47507U;
                            c9083a2 = c8077a.f43868b;
                            synchronized (c7967l1) {
                                C5207g.m11111f(c9083a2, "route");
                                ((Set) c7967l1.f43382a).remove(c9083a2);
                                if (this.f50758a.m18578a(this.f50759b, this.f50760c, arrayList, true)) {
                                    C8077a c8077a5 = this.f50760c.f50783j;
                                    C5207g.m11108c(c8077a5);
                                    this.f50767j = c9083a0;
                                    Socket socket3 = c8077a.f43870d;
                                    C5207g.m11108c(socket3);
                                    C9347b.m17698e(socket3);
                                    AbstractC9093k abstractC9093k10 = this.f50761d;
                                    C9990e c9990e12 = this.f50760c;
                                    abstractC9093k10.getClass();
                                    C5207g.m11111f(c9990e12, "call");
                                    c8077a2 = c8077a5;
                                } else {
                                    synchronized (c8077a) {
                                        C9991f c9991f3 = this.f50758a;
                                        c9991f3.getClass();
                                        byte[] bArr5 = C9347b.f48082a;
                                        c9991f3.f50795e.add(c8077a);
                                        c9991f3.f50793c.m18258c(c9991f3.f50794d, 0L);
                                        this.f50760c.m18570c(c8077a);
                                        C9072e c9072e4 = C9072e.f47360a;
                                        AbstractC9093k abstractC9093k11 = this.f50761d;
                                        C9990e c9990e13 = this.f50760c;
                                        abstractC9093k11.getClass();
                                        C5207g.m11111f(c9990e13, "call");
                                        c8077a2 = c8077a;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    c8077a = new C8077a(this.f50758a, c9083a0);
                    this.f50760c.f50773M = c8077a;
                    c8077a.m15972c(i10, i11, i12, z10, this.f50760c, this.f50761d);
                    this.f50760c.f50773M = null;
                    c7967l1 = this.f50760c.f50774a.f47507U;
                    c9083a2 = c8077a.f43868b;
                    synchronized (c7967l1) {
                        C5207g.m11111f(c9083a2, "route");
                        ((Set) c7967l1.f43382a).remove(c9083a2);
                        if (this.f50758a.m18578a(this.f50759b, this.f50760c, arrayList, true)) {
                            C8077a c8077a6 = this.f50760c.f50783j;
                            C5207g.m11108c(c8077a6);
                            this.f50767j = c9083a0;
                            Socket socket4 = c8077a.f43870d;
                            C5207g.m11108c(socket4);
                            C9347b.m17698e(socket4);
                            AbstractC9093k abstractC9093k12 = this.f50761d;
                            C9990e c9990e14 = this.f50760c;
                            abstractC9093k12.getClass();
                            C5207g.m11111f(c9990e14, "call");
                            c8077a2 = c8077a6;
                        } else {
                            synchronized (c8077a) {
                                C9991f c9991f4 = this.f50758a;
                                c9991f4.getClass();
                                byte[] bArr6 = C9347b.f48082a;
                                c9991f4.f50795e.add(c8077a);
                                c9991f4.f50793c.m18258c(c9991f4.f50794d, 0L);
                                this.f50760c.m18570c(c8077a);
                                C9072e c9072e5 = C9072e.f47360a;
                                AbstractC9093k abstractC9093k13 = this.f50761d;
                                C9990e c9990e15 = this.f50760c;
                                abstractC9093k13.getClass();
                                C5207g.m11111f(c9990e15, "call");
                                c8077a2 = c8077a;
                            }
                        }
                    }
                }
            }
            if (c8077a2.m15977i(z11)) {
                return c8077a2;
            }
            c8077a2.m15979k();
            if (this.f50767j == null) {
                C9992g.a aVar4 = this.f50762e;
                if (aVar4 == null ? true : aVar4.m18581a()) {
                    continue;
                } else {
                    C9992g c9992g2 = this.f50763f;
                    if (!(c9992g2 != null ? c9992g2.m18580a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18567b(C9096n c9096n) {
        C5207g.m11111f(c9096n, "url");
        C9096n c9096n2 = this.f50759b.f47378i;
        return c9096n.f47459e == c9096n2.f47459e && C5207g.m11106a(c9096n.f47458d, c9096n2.f47458d);
    }

    /* JADX INFO: renamed from: c */
    public final void m18568c(IOException iOException) {
        C5207g.m11111f(iOException, "e");
        this.f50767j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f43885a == ErrorCode.REFUSED_STREAM) {
            this.f50764g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f50765h++;
        } else {
            this.f50766i++;
        }
    }
}
