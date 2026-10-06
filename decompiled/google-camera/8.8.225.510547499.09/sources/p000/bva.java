package p000;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bva implements buz {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4516a;

    public bva(int i) {
        this.f4516a = i;
    }

    @Override // p000.buz
    /* JADX INFO: renamed from: a */
    public final Class mo3090a() {
        switch (this.f4516a) {
            case 0:
                return InputStream.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.buz
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo3091b(File file) {
        switch (this.f4516a) {
            case 0:
                return new FileInputStream(file);
            default:
                return ParcelFileDescriptor.open(file, 268435456);
        }
    }

    @Override // p000.buz
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo3092c(Object obj) throws IOException {
        switch (this.f4516a) {
            case 0:
                ((InputStream) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }
}
