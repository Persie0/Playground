package androidx.compose.p017ui.text.input;

import ae.C0062b;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.SaversKt;
import androidx.compose.runtime.saveable.SaverKt;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.List;
import p231l1.C7217k;
import p252m0.C7452c;
import p252m0.InterfaceC7453d;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldValue {

    /* JADX INFO: renamed from: a */
    public final C0689a f4647a;

    /* JADX INFO: renamed from: b */
    public final long f4648b;

    /* JADX INFO: renamed from: c */
    public final C7217k f4649c;

    static {
        SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7453d interfaceC7453d, TextFieldValue textFieldValue) {
                InterfaceC7453d interfaceC7453d2 = interfaceC7453d;
                TextFieldValue textFieldValue2 = textFieldValue;
                C5207g.m11111f(interfaceC7453d2, "$this$Saver");
                C5207g.m11111f(textFieldValue2, "it");
                return C9000b.m17237c(SaversKt.m2565a(textFieldValue2.f4647a, SaversKt.f4463a, interfaceC7453d2), SaversKt.m2565a(new C7217k(textFieldValue2.f4648b), SaversKt.f4475m, interfaceC7453d2));
            }
        }, new InterfaceC2052l<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final TextFieldValue mo528n(Object obj) {
                C5207g.m11111f(obj, "it");
                List list = (List) obj;
                Object obj2 = list.get(0);
                C7452c c7452c = SaversKt.f4463a;
                Boolean bool = Boolean.FALSE;
                C0689a c0689a = (C5207g.m11106a(obj2, bool) || obj2 == null) ? null : (C0689a) c7452c.f41273b.mo528n(obj2);
                C5207g.m11108c(c0689a);
                Object obj3 = list.get(1);
                int i10 = C7217k.f40597c;
                C7217k c7217k = (C5207g.m11106a(obj3, bool) || obj3 == null) ? null : (C7217k) SaversKt.f4475m.f41273b.mo528n(obj3);
                C5207g.m11108c(c7217k);
                return new TextFieldValue(c0689a, c7217k.f40598a, null);
            }
        });
    }

    public TextFieldValue(C0689a c0689a, long j10, C7217k c7217k) {
        this.f4647a = c0689a;
        String str = c0689a.f4523a;
        this.f4648b = C0062b.m421z0(str.length(), j10);
        this.f4649c = c7217k != null ? new C7217k(C0062b.m421z0(str.length(), c7217k.f40598a)) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        long j10 = textFieldValue.f4648b;
        int i10 = C7217k.f40597c;
        return ((this.f4648b > j10 ? 1 : (this.f4648b == j10 ? 0 : -1)) == 0) && C5207g.m11106a(this.f4649c, textFieldValue.f4649c) && C5207g.m11106a(this.f4647a, textFieldValue.f4647a);
    }

    public final int hashCode() {
        int iHashCode = this.f4647a.hashCode() * 31;
        int i10 = C7217k.f40597c;
        int iM847f = C0204c.m847f(this.f4648b, iHashCode, 31);
        C7217k c7217k = this.f4649c;
        return iM847f + (c7217k != null ? Long.hashCode(c7217k.f40598a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f4647a) + "', selection=" + ((Object) C7217k.m14542d(this.f4648b)) + ", composition=" + this.f4649c + ')';
    }
}
