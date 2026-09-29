package p000;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zg1 {

    /* JADX INFO: renamed from: e */
    public static final Pattern f71515e;

    /* JADX INFO: renamed from: f */
    public static final Pattern f71516f;

    /* JADX INFO: renamed from: a */
    public final HashSet f71517a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Executor f71518b;

    /* JADX INFO: renamed from: c */
    public final qg1 f71519c;

    /* JADX INFO: renamed from: d */
    public final qg1 f71520d;

    static {
        Charset.forName("UTF-8");
        f71515e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f71516f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public zg1(Executor executor, qg1 qg1Var, qg1 qg1Var2) {
        this.f71518b = executor;
        this.f71519c = qg1Var;
        this.f71520d = qg1Var2;
    }

    /* JADX INFO: renamed from: a */
    public static HashSet m25599a(qg1 qg1Var) {
        HashSet hashSet = new HashSet();
        sg1 sg1VarM19941c = qg1Var.m19941c();
        if (sg1VarM19941c != null) {
            Iterator<String> itKeys = sg1VarM19941c.f60806b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}
