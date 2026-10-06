package p000;

import android.os.AsyncTask;
import android.os.Process;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class coz extends AsyncTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cpa f8509a;

    public coz(cpa cpaVar) {
        this.f8509a = cpaVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Process.setThreadPriority(11);
        this.f8509a.f8512a.mo13961e("RemoveDeletedCacheTask");
        File[] fileArrListFiles = new File(((String[]) objArr)[0]).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                synchronized (this.f8509a.f8513b) {
                    if (file.isDirectory() && !this.f8509a.f8513b.contains(file.toString())) {
                        this.f8509a.m5219b(file);
                    }
                }
                if (isCancelled()) {
                    break;
                }
            }
        }
        this.f8509a.f8512a.mo13962f();
        return null;
    }
}
