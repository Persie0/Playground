package p271n5;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import p026b5.AbstractC1314g;
import p214k5.C6607i;
import p214k5.C6617s;
import p214k5.InterfaceC6608j;
import p214k5.InterfaceC6612n;
import p214k5.InterfaceC6621w;
import p260m8.C7499b;

/* JADX INFO: renamed from: n5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7708b {

    /* JADX INFO: renamed from: a */
    public static final String f42235a;

    static {
        String strM4868f = AbstractC1314g.m4868f("DiagnosticsWrkr");
        C5207g.m11110e(strM4868f, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f42235a = strM4868f;
    }

    /* JADX INFO: renamed from: a */
    public static final String m15301a(InterfaceC6612n interfaceC6612n, InterfaceC6621w interfaceC6621w, InterfaceC6608j interfaceC6608j, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6617s c6617s = (C6617s) it.next();
            C6607i c6607iMo13209a = interfaceC6608j.mo13209a(C7499b.m14892A(c6617s));
            Integer numValueOf = c6607iMo13209a != null ? Integer.valueOf(c6607iMo13209a.f37509c) : null;
            String str = c6617s.f37524a;
            String strM13430X = C6752c.m13430X(interfaceC6612n.mo13217b(str), ",", null, null, null, 62);
            String strM13430X2 = C6752c.m13430X(interfaceC6621w.mo13244a(str), ",", null, null, null, 62);
            StringBuilder sbM854m = C0204c.m854m("\n", str, "\t ");
            sbM854m.append(c6617s.f37526c);
            sbM854m.append("\t ");
            sbM854m.append(numValueOf);
            sbM854m.append("\t ");
            sbM854m.append(c6617s.f37525b.name());
            sbM854m.append("\t ");
            sbM854m.append(strM13430X);
            sbM854m.append("\t ");
            sbM854m.append(strM13430X2);
            sbM854m.append('\t');
            sb2.append(sbM854m.toString());
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
