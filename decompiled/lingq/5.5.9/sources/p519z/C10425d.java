package p519z;

import androidx.compose.p017ui.text.AndroidParagraph;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.platform.C0708a;
import dm.C5207g;
import dm.C5212l;
import kotlin.collections.EmptyList;
import mo.C7661i;
import p231l1.C7218l;
import p385sf.C9000b;
import p470x1.C10014b;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: z.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10425d {

    /* JADX INFO: renamed from: a */
    public static final String f52269a = C7661i.m15252R2(10, "H");

    /* JADX INFO: renamed from: a */
    public static final long m19403a(C7218l c7218l, InterfaceC10015c interfaceC10015c, AbstractC0696b.a aVar, String str, int i10) {
        C5207g.m11111f(c7218l, "style");
        C5207g.m11111f(interfaceC10015c, "density");
        C5207g.m11111f(aVar, "fontFamilyResolver");
        C5207g.m11111f(str, "text");
        EmptyList emptyList = EmptyList.f38032a;
        long jM18612b = C10014b.m18612b(0, 0, 15);
        C5207g.m11111f(emptyList, "spanStyles");
        C0708a c0708a = new C0708a(c7218l, aVar, interfaceC10015c, str, emptyList, emptyList);
        return C9000b.m17236a(C5212l.m11186z(c0708a.mo2563b()), C5212l.m11186z(new AndroidParagraph(c0708a, i10, false, jM18612b).mo2544a()));
    }
}
