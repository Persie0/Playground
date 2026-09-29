package p065d6;

import java.io.File;
import java.io.IOException;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: d6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5047a implements InterfaceC8736f<File, File> {
    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<File> mo68a(File file, int i10, int i11, C8735e c8735e) throws IOException {
        return new C5048b(file);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo69b(File file, C8735e c8735e) throws IOException {
        return true;
    }
}
