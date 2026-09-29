package p474x5;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p236l6.C7283d;
import p258m6.C7481a;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10078c implements InterfaceC10090o<File, ByteBuffer> {

    /* JADX INFO: renamed from: x5.c$a */
    public static final class a implements InterfaceC2097d<ByteBuffer> {

        /* JADX INFO: renamed from: a */
        public final File f51135a;

        public a(File file) {
            this.f51135a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<ByteBuffer> mo6269a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: d */
        public final DataSource mo6274d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo6278f(C7481a.m14864a(this.f51135a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.mo6277c(e10);
            }
        }
    }

    /* JADX INFO: renamed from: x5.c$b */
    public static class b implements InterfaceC10091p<File, ByteBuffer> {
        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<File, ByteBuffer> mo18922c(C10094s c10094s) {
            return new C10078c();
        }
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(File file) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<ByteBuffer> mo18920b(File file, int i10, int i11, C8735e c8735e) {
        File file2 = file;
        return new InterfaceC10090o.a<>(new C7283d(file2), new a(file2));
    }
}
