package p000;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jln {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f34318e = 0;

    /* JADX INFO: renamed from: f */
    private static final mws f34319f = mws.m17097l("CREATE TABLE collections(id INTEGER PRIMARY KEY, collection_name STRING NOT NULL,time INTEGER NOT NULL,selection_key INTEGER NOT NULL,value BLOB NOT NULL)");

    /* JADX INFO: renamed from: a */
    public final jlp f34320a;

    /* JADX INFO: renamed from: b */
    public final ksi f34321b;

    /* JADX INFO: renamed from: c */
    public final Random f34322c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f34323d;

    public jln(Context context, ksi ksiVar, Random random, ExecutorService executorService) {
        this.f34320a = new jlp(context, f34319f);
        this.f34321b = ksiVar;
        this.f34322c = random;
        this.f34323d = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final nps m13341a(mrf mrfVar) {
        return kxk.m14970P(new cnn(this, mrfVar, 6), this.f34323d);
    }
}
