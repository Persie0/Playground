package p489xk;

import androidx.room.RoomDatabase;
import com.tonyodev.fetch2.database.DownloadDatabase;
import dm.C5206f;

/* JADX INFO: renamed from: xk.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10218f implements InterfaceC10213a {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f51632a;

    /* JADX INFO: renamed from: b */
    public final C10214b f51633b;

    /* JADX INFO: renamed from: c */
    public final C5206f f51634c = new C5206f();

    /* JADX INFO: renamed from: d */
    public final C10215c f51635d;

    /* JADX INFO: renamed from: e */
    public final C10216d f51636e;

    public C10218f(DownloadDatabase downloadDatabase) {
        this.f51632a = downloadDatabase;
        this.f51633b = new C10214b(this, downloadDatabase);
        this.f51635d = new C10215c(downloadDatabase);
        this.f51636e = new C10216d(this, downloadDatabase);
        new C10217e(downloadDatabase);
    }
}
