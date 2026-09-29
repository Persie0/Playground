package p121fh;

import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Arrays;
import p349qo.C8656b;
import p534zf.C10487e;

/* JADX INFO: renamed from: fh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5533b implements InterfaceC5534c {

    /* JADX INFO: renamed from: a */
    public final String f34219a;

    /* JADX INFO: renamed from: b */
    public final boolean f34220b;

    /* JADX INFO: renamed from: c */
    public final String[] f34221c;

    /* JADX INFO: renamed from: d */
    public final String[] f34222d;

    public C5533b() {
        this.f34219a = "";
        this.f34220b = false;
        this.f34221c = new String[0];
        this.f34222d = new String[0];
    }

    public C5533b(String str, boolean z10, String[] strArr, String[] strArr2) {
        this.f34219a = str;
        this.f34220b = z10;
        this.f34221c = strArr;
        this.f34222d = strArr2;
    }

    @Override // p121fh.InterfaceC5534c
    /* JADX INFO: renamed from: a */
    public final String mo11776a() {
        return this.f34219a;
    }

    @Override // p121fh.InterfaceC5534c
    /* JADX INFO: renamed from: b */
    public final boolean mo11777b() {
        return this.f34220b;
    }

    @Override // p121fh.InterfaceC5534c
    /* JADX INFO: renamed from: c */
    public final C10487e mo11778c() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19450D("name", this.f34219a);
        c10487eM19445u.m19472x("sleep", this.f34220b);
        c10487eM19445u.m19447A("payloads", C8656b.m16895V(this.f34221c));
        c10487eM19445u.m19447A("keys", C8656b.m16895V(this.f34222d));
        return c10487eM19445u;
    }

    @Override // p121fh.InterfaceC5534c
    /* JADX INFO: renamed from: d */
    public final ArrayList mo11779d() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f34221c) {
            PayloadType payloadTypeFromKeyNullable = PayloadType.fromKeyNullable(str);
            if (payloadTypeFromKeyNullable != null) {
                arrayList.add(payloadTypeFromKeyNullable);
            }
        }
        return arrayList;
    }

    @Override // p121fh.InterfaceC5534c
    /* JADX INFO: renamed from: e */
    public final ArrayList mo11780e() {
        return new ArrayList(Arrays.asList(this.f34222d));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (C5533b.class == obj.getClass()) {
                    C5533b c5533b = (C5533b) obj;
                    if (this.f34220b != c5533b.f34220b || !this.f34219a.equals(c5533b.f34219a) || !Arrays.equals(this.f34221c, c5533b.f34221c) || !Arrays.equals(this.f34222d, c5533b.f34222d)) {
                        z10 = false;
                    }
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized int hashCode() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return mo11778c().toString().hashCode();
    }
}
