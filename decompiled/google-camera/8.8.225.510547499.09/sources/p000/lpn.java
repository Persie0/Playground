package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lpn extends lpv {
    public lpn(lpt lptVar, String str, Long l, boolean z) {
        super(lptVar, str, l, z);
    }

    @Override // p000.lpv
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15831a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException e) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.m15846f() + ": " + ((String) obj));
            return null;
        }
    }
}
