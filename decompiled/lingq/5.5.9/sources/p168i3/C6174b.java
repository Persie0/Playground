package p168i3;

import android.content.SharedPreferences;
import dm.C5207g;
import java.util.Set;

/* JADX INFO: renamed from: i3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6174b {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f36012a;

    /* JADX INFO: renamed from: b */
    public final Set<String> f36013b;

    public C6174b(SharedPreferences sharedPreferences, Set<String> set) {
        C5207g.m11111f(sharedPreferences, "prefs");
        this.f36012a = sharedPreferences;
        this.f36013b = set;
    }
}
