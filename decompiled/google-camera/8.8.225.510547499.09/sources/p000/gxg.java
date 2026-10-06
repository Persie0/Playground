package p000;

import android.content.Context;
import android.os.Environment;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxg implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f26718a;

    public gxg(oju ojuVar) {
        this.f26718a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gyg get() {
        hlk hlkVarM10340a = hii.m10340a();
        Context contextM6830a = ((dws) this.f26718a).m6830a();
        return new gyg(Environment.isExternalStorageEmulated() ? contextM6830a.getExternalFilesDir(null) : contextM6830a.getNoBackupFilesDir(), contextM6830a.getExternalFilesDir(null), hlkVarM10340a);
    }
}
