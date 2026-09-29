package p352r1;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.C0689a;
import dm.C5207g;

/* JADX INFO: renamed from: r1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8701b implements InterfaceC8704e {

    /* JADX INFO: renamed from: a */
    public final C0689a f46287a;

    /* JADX INFO: renamed from: b */
    public final int f46288b;

    public C8701b(String str, int i10) {
        this.f46287a = new C0689a(str);
        this.f46288b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8701b)) {
            return false;
        }
        C8701b c8701b = (C8701b) obj;
        if (C5207g.m11106a(this.f46287a.f4523a, c8701b.f46287a.f4523a) && this.f46288b == c8701b.f46288b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f46287a.f4523a.hashCode() * 31) + this.f46288b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f46287a.f4523a);
        sb2.append("', newCursorPosition=");
        return C0204c.m853l(sb2, this.f46288b, ')');
    }
}
