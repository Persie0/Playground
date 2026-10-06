package p000;

import android.database.sqlite.SQLiteDatabase;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jzm implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f35314a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f35315b;

    public /* synthetic */ jzm(long j, int i) {
        this.f35315b = i;
        this.f35314a = j;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        switch (this.f35315b) {
            case 0:
                long j = this.f35314a;
                long jLongValue = ((Long) obj).longValue();
                if (j <= 0) {
                    j = Long.MAX_VALUE;
                }
                if (jLongValue <= 0) {
                    jLongValue = Long.MAX_VALUE;
                }
                return new jyo(j, jLongValue);
            case 1:
                long j2 = this.f35314a;
                djm djmVar = (djm) obj;
                Object obj2 = djmVar.f11788b;
                long jCurrentTimeMillis = System.currentTimeMillis() - j2;
                String.format("Cleared %s records older than %s", Integer.valueOf(((SQLiteDatabase) djmVar.f11787a).delete("collections", "time< " + jCurrentTimeMillis, new String[0])), SimpleDateFormat.getDateTimeInstance().format(new Date(jCurrentTimeMillis)));
                int i = jln.f34318e;
                return null;
            default:
                return Long.valueOf(((Long) obj).longValue() / this.f35314a);
        }
    }
}
