package p000;

import android.database.sqlite.SQLiteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jad extends jai {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jaf f33552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jad(jaf jafVar, izv izvVar) {
        super(izvVar);
        this.f33552a = jafVar;
    }

    @Override // p000.jai
    /* JADX INFO: renamed from: a */
    public final void mo11953a() {
        jaf jafVar = this.f33552a;
        try {
            jaa jaaVar = jafVar.f33555c;
            izo.m11916a();
            jaaVar.m11946z();
            if (jaaVar.f33547d.m12812c(86400000L)) {
                jaaVar.f33547d.m12811b();
                jaaVar.m11936q("Deleting stale hits (if any)");
                jaaVar.m11937r("Deleted stale hits, count", Integer.valueOf(jaaVar.m12759b().delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
            }
            jafVar.m12767F();
        } catch (SQLiteException e) {
            jafVar.m11940u("Failed to delete stale hits", e);
        }
        jafVar.f33556d.m12782d(86400000L);
    }
}
