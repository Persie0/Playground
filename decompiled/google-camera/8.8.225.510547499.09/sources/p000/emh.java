package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emh implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f14706a;

    /* JADX INFO: renamed from: b */
    private final Object f14707b;

    public emh(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14706a = i;
        this.f14707b = gtdVar;
    }

    public emh(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14706a = i;
        this.f14707b = gtdVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f14706a) {
            case 0:
                break;
        }
        return m7522a();
    }

    /* JADX INFO: renamed from: a */
    public final ContentResolver m7522a() {
        switch (this.f14706a) {
            case 0:
                ContentResolver contentResolver = ((Application) ((gtd) this.f14707b).f26334a).getContentResolver();
                contentResolver.getClass();
                return contentResolver;
            default:
                ContentResolver contentResolver2 = ((Activity) ((gtd) this.f14707b).f26334a).getContentResolver();
                contentResolver2.getClass();
                return contentResolver2;
        }
    }
}
