package p000;

import com.google.protobuf.AbstractC1180a;
import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.ByteString;
import com.google.protobuf.C1181b;
import com.google.protobuf.WireFormat$FieldType;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g33 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f40107c = 0;

    /* JADX INFO: renamed from: a */
    public final kb9 f40108a = new kb9(16);

    /* JADX INFO: renamed from: b */
    public boolean f40109b;

    static {
        new g33(0);
    }

    public g33(int i) {
        m12311a();
        m12311a();
    }

    /* JADX INFO: renamed from: b */
    public static void m12310b(C1181b c1181b, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            c1181b.m6806o(i, 3);
            ((AbstractC1180a) obj).mo6791i(c1181b);
            c1181b.m6806o(i, 4);
        }
        c1181b.m6806o(i, wireFormat$FieldType.getWireType());
        switch (f33.f38336b[wireFormat$FieldType.ordinal()]) {
            case 1:
                c1181b.m6803l(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                c1181b.m6801j(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                c1181b.m6809r(((Long) obj).longValue());
                break;
            case 4:
                c1181b.m6809r(((Long) obj).longValue());
                break;
            case 5:
                c1181b.m6804m(((Integer) obj).intValue());
                break;
            case 6:
                c1181b.m6803l(((Long) obj).longValue());
                break;
            case 7:
                c1181b.m6801j(((Integer) obj).intValue());
                break;
            case 8:
                c1181b.m6797f(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((AbstractC1180a) obj).mo6791i(c1181b);
                break;
            case 10:
                AbstractC1180a abstractC1180a = (AbstractC1180a) obj;
                c1181b.m6807p(((AbstractC1183d) abstractC1180a).mo6790h(null));
                abstractC1180a.mo6791i(c1181b);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    c1181b.m6805n((String) obj);
                } else {
                    c1181b.m6799h((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1181b.m6807p(length);
                    c1181b.m6798g(bArr, 0, length);
                } else {
                    c1181b.m6799h((ByteString) obj);
                }
                break;
            case 13:
                c1181b.m6807p(((Integer) obj).intValue());
                break;
            case 14:
                c1181b.m6801j(((Integer) obj).intValue());
                break;
            case 15:
                c1181b.m6803l(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c1181b.m6807p((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c1181b.m6809r((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof a94)) {
                    c1181b.m6804m(((Integer) obj).intValue());
                } else {
                    c1181b.m6804m(((a94) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12311a() {
        kb9 kb9Var;
        if (this.f40109b) {
            return;
        }
        int i = 0;
        while (true) {
            kb9Var = this.f40108a;
            if (i >= kb9Var.f46983b.size()) {
                break;
            }
            Map.Entry entryM15053c = kb9Var.m15053c(i);
            if (entryM15053c.getValue() instanceof AbstractC1183d) {
                AbstractC1183d abstractC1183d = (AbstractC1183d) entryM15053c.getValue();
                abstractC1183d.getClass();
                go7 go7Var = go7.f41083c;
                go7Var.getClass();
                go7Var.m12783a(abstractC1183d.getClass()).makeImmutable(abstractC1183d);
                abstractC1183d.m6816o();
            }
            i++;
        }
        if (!kb9Var.f46985d) {
            if (kb9Var.f46983b.size() > 0) {
                kb9Var.m15053c(0).getKey().getClass();
                ho2.m13383c();
                return;
            } else {
                Iterator it = kb9Var.m15054d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    ho2.m13383c();
                    return;
                }
            }
        }
        if (!kb9Var.f46985d) {
            kb9Var.f46984c = kb9Var.f46984c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(kb9Var.f46984c);
            kb9Var.f46987f = kb9Var.f46987f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(kb9Var.f46987f);
            kb9Var.f46985d = true;
        }
        this.f40109b = true;
    }

    public final Object clone() {
        g33 g33Var = new g33();
        kb9 kb9Var = this.f40108a;
        if (kb9Var.f46983b.size() > 0) {
            Map.Entry entryM15053c = kb9Var.m15053c(0);
            g9a.m12435l(entryM15053c.getKey());
            entryM15053c.getValue();
            throw null;
        }
        Iterator it = kb9Var.m15054d().iterator();
        if (!it.hasNext()) {
            return g33Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        g9a.m12435l(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g33) {
            return this.f40108a.equals(((g33) obj).f40108a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40108a.hashCode();
    }

    public g33() {
    }
}
