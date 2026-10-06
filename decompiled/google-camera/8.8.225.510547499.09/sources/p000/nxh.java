package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxh {

    /* JADX INFO: renamed from: a */
    public static final nxh f44910a = new nxh(null);

    /* JADX INFO: renamed from: b */
    public final nzu f44911b = nzu.m18319b(16);

    /* JADX INFO: renamed from: c */
    public boolean f44912c;

    /* JADX INFO: renamed from: d */
    private boolean f44913d;

    private nxh() {
    }

    /* JADX INFO: renamed from: a */
    public static int m18016a(oaj oajVar, int i, Object obj) {
        boolean z = nxb.f44893e;
        int iM17981Z = nxb.m17981Z(i);
        if (oajVar == oaj.GROUP) {
            nxz.m18157f((nyw) obj);
            iM17981Z += iM17981Z;
        }
        oak oakVar = oak.INT;
        int iM17985ad = 4;
        switch (oajVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iM17985ad = 8;
                break;
            case FLOAT:
                ((Float) obj).floatValue();
                break;
            case f45133c:
                iM17985ad = nxb.m17985ad(((Long) obj).longValue());
                break;
            case UINT64:
                iM17985ad = nxb.m17985ad(((Long) obj).longValue());
                break;
            case INT32:
                iM17985ad = nxb.m17967L(((Integer) obj).intValue());
                break;
            case FIXED64:
                ((Long) obj).longValue();
                iM17985ad = 8;
                break;
            case FIXED32:
                ((Integer) obj).intValue();
                break;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iM17985ad = 1;
                break;
            case STRING:
                iM17985ad = !(obj instanceof nwr) ? nxb.m17980Y((String) obj) : nxb.m17963H((nwr) obj);
                break;
            case GROUP:
                iM17985ad = ((nyw) obj).mo18136N();
                break;
            case f45141k:
                iM17985ad = !(obj instanceof nyg) ? nxb.m17972Q((nyw) obj) : nxb.m17970O((nyg) obj);
                break;
            case BYTES:
                iM17985ad = !(obj instanceof nwr) ? nxb.m17971P(((byte[]) obj).length) : nxb.m17963H((nwr) obj);
                break;
            case UINT32:
                iM17985ad = nxb.m17983ab(((Integer) obj).intValue());
                break;
            case ENUM:
                iM17985ad = !(obj instanceof nxt) ? nxb.m17967L(((Integer) obj).intValue()) : nxb.m17967L(((nxt) obj).mo14936a());
                break;
            case SFIXED32:
                ((Integer) obj).intValue();
                break;
            case SFIXED64:
                ((Long) obj).longValue();
                iM17985ad = 8;
                break;
            case f45147q:
                iM17985ad = nxb.m17976U(((Integer) obj).intValue());
                break;
            case SINT64:
                iM17985ad = nxb.m17978W(((Long) obj).longValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM17981Z + iM17985ad;
    }

    /* JADX INFO: renamed from: g */
    public static void m18017g(nxb nxbVar, oaj oajVar, int i, Object obj) {
        if (oajVar == oaj.GROUP) {
            nyw nywVar = (nyw) obj;
            nxz.m18157f(nywVar);
            nxbVar.mo17929A(i, 3);
            nxbVar.m18003ao(nywVar);
            nxbVar.mo17929A(i, 4);
            return;
        }
        nxbVar.mo17929A(i, oajVar.f45151t);
        oak oakVar = oak.INT;
        switch (oajVar) {
            case DOUBLE:
                nxbVar.m18000al(((Double) obj).doubleValue());
                break;
            case FLOAT:
                nxbVar.m18002an(((Float) obj).floatValue());
                break;
            case f45133c:
                nxbVar.mo17933E(((Long) obj).longValue());
                break;
            case UINT64:
                nxbVar.mo17933E(((Long) obj).longValue());
                break;
            case INT32:
                nxbVar.mo17953t(((Integer) obj).intValue());
                break;
            case FIXED64:
                nxbVar.mo17951r(((Long) obj).longValue());
                break;
            case FIXED32:
                nxbVar.mo17949p(((Integer) obj).intValue());
                break;
            case BOOL:
                nxbVar.mo17943j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof nwr)) {
                    nxbVar.mo17959z((String) obj);
                } else {
                    nxbVar.mo17947n((nwr) obj);
                }
                break;
            case GROUP:
                nxbVar.m18003ao((nyw) obj);
                break;
            case f45141k:
                nxbVar.mo17955v((nyw) obj);
                break;
            case BYTES:
                if (!(obj instanceof nwr)) {
                    byte[] bArr = (byte[]) obj;
                    nxbVar.mo17934F(bArr, bArr.length);
                } else {
                    nxbVar.mo17947n((nwr) obj);
                }
                break;
            case UINT32:
                nxbVar.mo17931C(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof nxt)) {
                    nxbVar.mo17953t(((Integer) obj).intValue());
                } else {
                    nxbVar.mo17953t(((nxt) obj).mo14936a());
                }
                break;
            case SFIXED32:
                nxbVar.mo17949p(((Integer) obj).intValue());
                break;
            case SFIXED64:
                nxbVar.mo17951r(((Long) obj).longValue());
                break;
            case f45147q:
                nxbVar.m18005aq(((Integer) obj).intValue());
                break;
            case SINT64:
                nxbVar.m18007as(((Long) obj).longValue());
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m18018j(nxp nxpVar, Object obj) {
        return m18016a(nxpVar.f44978b, nxpVar.f44977a, obj);
    }

    /* JADX INFO: renamed from: m */
    private static Object m18019m(Object obj) {
        if (obj instanceof nzb) {
            return ((nzb) obj).mo17762c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m18020n(Map.Entry entry) {
        if (((nxp) entry.getKey()).m18122a() != oak.MESSAGE) {
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof nyx) {
            return ((nyx) value).mo18098cz();
        }
        if (value instanceof nyg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: b */
    public final int m18021b(Map.Entry entry) {
        nxp nxpVar = (nxp) entry.getKey();
        Object value = entry.getValue();
        if (nxpVar.m18122a() != oak.MESSAGE) {
            return m18018j(nxpVar, value);
        }
        if (value instanceof nyg) {
            int iM17982aa = nxb.m17982aa(2, ((nxp) entry.getKey()).f44977a);
            int iM17969N = nxb.m17969N(3, (nyg) value);
            int iM17981Z = nxb.m17981Z(1);
            return iM17981Z + iM17981Z + iM17982aa + iM17969N;
        }
        int iM17982aa2 = nxb.m17982aa(2, ((nxp) entry.getKey()).f44977a);
        int iM17981Z2 = nxb.m17981Z(3) + nxb.m17972Q((nyw) value);
        int iM17981Z3 = nxb.m17981Z(1);
        return iM17981Z3 + iM17981Z3 + iM17982aa2 + iM17981Z2;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nxh clone() {
        nxh nxhVar = new nxh();
        for (int i = 0; i < this.f44911b.m18322a(); i++) {
            Map.Entry entryM18326f = this.f44911b.m18326f(i);
            nxhVar.m18029l((nxp) entryM18326f.getKey(), entryM18326f.getValue());
        }
        for (Map.Entry entry : this.f44911b.m18323c()) {
            nxhVar.m18029l((nxp) entry.getKey(), entry.getValue());
        }
        nxhVar.f44913d = this.f44913d;
        return nxhVar;
    }

    /* JADX INFO: renamed from: d */
    public final Iterator m18023d() {
        return this.f44913d ? new nyf(this.f44911b.entrySet().iterator()) : this.f44911b.entrySet().iterator();
    }

    /* JADX INFO: renamed from: e */
    public final void m18024e() {
        if (this.f44912c) {
            return;
        }
        for (int i = 0; i < this.f44911b.m18322a(); i++) {
            Map.Entry entryM18326f = this.f44911b.m18326f(i);
            if (entryM18326f.getValue() instanceof nxq) {
                ((nxq) entryM18326f.getValue()).m18140Y();
            }
        }
        nzu nzuVar = this.f44911b;
        if (!nzuVar.f45097c) {
            for (int i2 = 0; i2 < nzuVar.m18322a(); i2++) {
            }
            Iterator it = nzuVar.m18323c().iterator();
            while (it.hasNext()) {
            }
        }
        if (!nzuVar.f45097c) {
            nzuVar.f45096b = nzuVar.f45096b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(nzuVar.f45096b);
            nzuVar.f45098d = nzuVar.f45098d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(nzuVar.f45098d);
            nzuVar.f45097c = true;
        }
        this.f44912c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nxh) {
            return this.f44911b.equals(((nxh) obj).f44911b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m18025f(Map.Entry entry) {
        nxp nxpVar = (nxp) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof nyg) {
            throw null;
        }
        if (nxpVar.m18122a() != oak.MESSAGE) {
            this.f44911b.put(nxpVar, m18019m(value));
            return;
        }
        Object objM18028k = m18028k(nxpVar);
        if (objM18028k == null) {
            this.f44911b.put(nxpVar, m18019m(value));
            return;
        }
        if (objM18028k instanceof nzb) {
            throw new UnsupportedOperationException();
        }
        nyv nyvVarMo17763cl = ((nyw) objM18028k).mo17763cl();
        ((nxl) nyvVarMo17763cl).m18108s((nxq) ((nyw) value));
        this.f44911b.put(nxpVar, nyvVarMo17763cl.mo18103l());
    }

    /* JADX INFO: renamed from: h */
    final boolean m18026h() {
        return this.f44911b.isEmpty();
    }

    public final int hashCode() {
        return this.f44911b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18027i() {
        for (int i = 0; i < this.f44911b.m18322a(); i++) {
            if (!m18020n(this.f44911b.m18326f(i))) {
                return false;
            }
        }
        Iterator it = this.f44911b.m18323c().iterator();
        while (it.hasNext()) {
            if (!m18020n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m18028k(nxp nxpVar) {
        Object obj = this.f44911b.get(nxpVar);
        if (!(obj instanceof nyg)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if ((r7 instanceof p000.nxt) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r7 instanceof p000.nyg) == false) goto L32;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m18029l(nxp nxpVar, Object obj) {
        boolean z;
        oaj oajVar = nxpVar.f44978b;
        nxz.m18156e(obj);
        oaj oajVar2 = oaj.DOUBLE;
        oak oakVar = oak.INT;
        switch (oajVar.f45150s) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof nwr)) {
                    break;
                }
                if (obj instanceof nyg) {
                    this.f44913d = true;
                }
                this.f44911b.put(nxpVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof nyg) {
                    this.f44913d = true;
                }
                this.f44911b.put(nxpVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof nyw)) {
                    break;
                }
                if (obj instanceof nyg) {
                    this.f44913d = true;
                }
                this.f44911b.put(nxpVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(nxpVar.f44977a), nxpVar.f44978b.f45150s, obj.getClass().getName()));
        }
    }

    private nxh(byte[] bArr) {
        m18024e();
        m18024e();
    }
}
