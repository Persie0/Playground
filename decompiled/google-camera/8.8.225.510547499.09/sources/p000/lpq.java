package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpq extends lpv {
    public lpq(lpt lptVar, String str, Double d) {
        super(lptVar, str, d, false);
    }

    @Override // p000.lpv
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15831a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException e) {
            Log.e("PhenotypeFlag", "Invalid double value for " + super.m15846f() + ": " + ((String) obj));
            return null;
        }
    }
}
