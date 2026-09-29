package p000;

import android.os.LocaleList;
import androidx.compose.runtime.internal.C0282a;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fcb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f38868a = new C0282a(1086298343, false, new z70(1));

    /* JADX INFO: renamed from: b */
    public static final C0282a f38869b = new C0282a(709809030, false, new z70(2));

    /* JADX INFO: renamed from: c */
    public static final C0282a f38870c = new C0282a(1448864017, false, new z70(3));

    /* JADX INFO: renamed from: a */
    public static yi5 m11772a(yi5 yi5Var, yi5 yi5Var2) {
        if (yi5Var == null || yi5Var.f69868a.f71609a.isEmpty()) {
            return yi5.f69867b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < yi5Var2.m25156c() + yi5Var.m25156c()) {
            Locale localeM25155b = i < yi5Var.m25156c() ? yi5Var.m25155b(i) : yi5Var2.m25155b(i - yi5Var.m25156c());
            if (localeM25155b != null) {
                linkedHashSet.add(localeM25155b);
            }
            i++;
        }
        return new yi5(new zi5(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
    }
}
