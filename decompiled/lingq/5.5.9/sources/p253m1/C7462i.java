package p253m1;

import android.os.Build;
import android.text.StaticLayout;
import dm.C5207g;

/* JADX INFO: renamed from: m1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7462i implements InterfaceC7467n {
    @Override // p253m1.InterfaceC7467n
    /* JADX INFO: renamed from: a */
    public StaticLayout mo14833a(C7468o c7468o) {
        C5207g.m11111f(c7468o, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(c7468o.f41296a, c7468o.f41297b, c7468o.f41298c, c7468o.f41299d, c7468o.f41300e);
        builderObtain.setTextDirection(c7468o.f41301f);
        builderObtain.setAlignment(c7468o.f41302g);
        builderObtain.setMaxLines(c7468o.f41303h);
        builderObtain.setEllipsize(c7468o.f41304i);
        builderObtain.setEllipsizedWidth(c7468o.f41305j);
        builderObtain.setLineSpacing(c7468o.f41307l, c7468o.f41306k);
        builderObtain.setIncludePad(c7468o.f41309n);
        builderObtain.setBreakStrategy(c7468o.f41311p);
        builderObtain.setHyphenationFrequency(c7468o.f41314s);
        builderObtain.setIndents(c7468o.f41315t, c7468o.f41316u);
        int i10 = Build.VERSION.SDK_INT;
        C7463j.m14834a(builderObtain, c7468o.f41308m);
        if (i10 >= 28) {
            C7464k.m14835a(builderObtain, c7468o.f41310o);
        }
        if (i10 >= 33) {
            C7465l.m14837b(builderObtain, c7468o.f41312q, c7468o.f41313r);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        C5207g.m11110e(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }
}
