package p000;

import android.app.LocaleManager;
import android.content.Context;
import android.os.LocaleList;
import android.support.v7.widget.RecyclerView;
import android.widget.EdgeEffect;
import java.io.File;
import java.util.Collections;

/* JADX INFO: renamed from: ek */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0159ek {
    public C0159ek() {
    }

    public C0159ek(byte[] bArr) {
        Collections.emptyList();
        Collections.emptyList();
    }

    /* JADX INFO: renamed from: a */
    public static LocaleList m7404a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m7405b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* JADX INFO: renamed from: d */
    public static File m7406d(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    /* JADX INFO: renamed from: c */
    public EdgeEffect mo7407c(RecyclerView recyclerView) {
        return new EdgeEffect(recyclerView.getContext());
    }
}
