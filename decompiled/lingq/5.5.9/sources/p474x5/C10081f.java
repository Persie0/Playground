package p474x5;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p236l6.C7283d;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10081f<Data> implements InterfaceC10090o<File, Data> {

    /* JADX INFO: renamed from: a */
    public final d<Data> f51151a;

    /* JADX INFO: renamed from: x5.f$a */
    public static class a<Data> implements InterfaceC10091p<File, Data> {

        /* JADX INFO: renamed from: a */
        public final d<Data> f51152a;

        public a(d<Data> dVar) {
            this.f51152a = dVar;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<File, Data> mo18922c(C10094s c10094s) {
            return new C10081f(this.f51152a);
        }
    }

    /* JADX INFO: renamed from: x5.f$b */
    public static class b extends a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: x5.f$b$a */
        public class a implements d<ParcelFileDescriptor> {
            @Override // p474x5.C10081f.d
            /* JADX INFO: renamed from: a */
            public final Class<ParcelFileDescriptor> mo18929a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p474x5.C10081f.d
            /* JADX INFO: renamed from: b */
            public final void mo18930b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p474x5.C10081f.d
            /* JADX INFO: renamed from: c */
            public final ParcelFileDescriptor mo18931c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: x5.f$c */
    public static final class c<Data> implements InterfaceC2097d<Data> {

        /* JADX INFO: renamed from: a */
        public final File f51153a;

        /* JADX INFO: renamed from: b */
        public final d<Data> f51154b;

        /* JADX INFO: renamed from: c */
        public Data f51155c;

        public c(File file, d<Data> dVar) {
            this.f51153a = file;
            this.f51154b = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<Data> mo6269a() {
            return this.f51154b.mo18929a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
            Data data = this.f51155c;
            if (data != null) {
                try {
                    this.f51154b.mo18930b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: d */
        public final DataSource mo6274d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super Data> aVar) {
            try {
                Data dataMo18931c = this.f51154b.mo18931c(this.f51153a);
                this.f51155c = dataMo18931c;
                aVar.mo6278f(dataMo18931c);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.mo6277c(e10);
            }
        }
    }

    /* JADX INFO: renamed from: x5.f$d */
    public interface d<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo18929a();

        /* JADX INFO: renamed from: b */
        void mo18930b(Data data) throws IOException;

        /* JADX INFO: renamed from: c */
        Data mo18931c(File file) throws FileNotFoundException;
    }

    /* JADX INFO: renamed from: x5.f$e */
    public static class e extends a<InputStream> {

        /* JADX INFO: renamed from: x5.f$e$a */
        public class a implements d<InputStream> {
            @Override // p474x5.C10081f.d
            /* JADX INFO: renamed from: a */
            public final Class<InputStream> mo18929a() {
                return InputStream.class;
            }

            @Override // p474x5.C10081f.d
            /* JADX INFO: renamed from: b */
            public final void mo18930b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p474x5.C10081f.d
            /* JADX INFO: renamed from: c */
            public final InputStream mo18931c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C10081f(d<Data> dVar) {
        this.f51151a = dVar;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(File file) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(File file, int i10, int i11, C8735e c8735e) {
        File file2 = file;
        return new InterfaceC10090o.a(new C7283d(file2), new c(file2, this.f51151a));
    }
}
