package p000;

import android.content.Context;
import com.lingq.core.domain.language.C1377a;
import com.lingq.core.settings.domain.C1862a;
import com.lingq.core.settings.domain.C1864c;
import com.lingq.core.settings.domain.C1865d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class k09 {

    /* JADX INFO: renamed from: a */
    public final Context f46505a;

    /* JADX INFO: renamed from: b */
    public final un1 f46506b;

    /* JADX INFO: renamed from: c */
    public final nn1 f46507c;

    /* JADX INFO: renamed from: d */
    public final un1 f46508d;

    /* JADX INFO: renamed from: e */
    public final C1864c f46509e;

    /* JADX INFO: renamed from: f */
    public final C1865d f46510f;

    /* JADX INFO: renamed from: g */
    public final C1862a f46511g;

    /* JADX INFO: renamed from: h */
    public final hi8 f46512h;

    /* JADX INFO: renamed from: i */
    public final C3156jq f46513i;

    /* JADX INFO: renamed from: j */
    public final C1377a f46514j;

    /* JADX INFO: renamed from: k */
    public final hi8 f46515k;

    /* JADX INFO: renamed from: l */
    public final cma f46516l;

    /* JADX INFO: renamed from: m */
    public final C3244l f46517m;

    /* JADX INFO: renamed from: n */
    public final C3244l f46518n;

    public k09(Context context, un1 un1Var, nn1 nn1Var, un1 un1Var2, C1864c c1864c, C1865d c1865d, C1862a c1862a, hi8 hi8Var, C3156jq c3156jq, C1377a c1377a, hi8 hi8Var2, cma cmaVar) {
        un1Var.getClass();
        un1Var2.getClass();
        cmaVar.getClass();
        this.f46505a = context;
        this.f46506b = un1Var;
        this.f46507c = nn1Var;
        this.f46508d = un1Var2;
        this.f46509e = c1864c;
        this.f46510f = c1865d;
        this.f46511g = c1862a;
        this.f46512h = hi8Var;
        this.f46513i = c3156jq;
        this.f46514j = c1377a;
        this.f46515k = hi8Var2;
        this.f46516l = cmaVar;
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f46517m = c3244lM17114d;
        this.f46518n = c3244lM17114d;
    }

    /* JADX INFO: renamed from: a */
    public final void m14759a() {
        ob1.Companion.getClass();
        ArrayList arrayListM16141a = ldd.m16141a(mb1.m16743c(this.f46505a));
        long length = 0;
        if (arrayListM16141a != null) {
            Iterator it = arrayListM16141a.iterator();
            while (it.hasNext()) {
                length += ((File) it.next()).length();
            }
        }
        String str = String.format(Locale.getDefault(), "%d mb", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((length / 1024) / 1024))}, 1));
        C3244l c3244l = this.f46517m;
        c3244l.getClass();
        c3244l.m15572j(null, str);
    }
}
