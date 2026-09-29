package p474x5;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p236l6.C7283d;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10079d<Model, Data> implements InterfaceC10090o<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final a<Data> f51136a;

    /* JADX INFO: renamed from: x5.d$a */
    public interface a<Data> {
    }

    /* JADX INFO: renamed from: x5.d$b */
    public static final class b<Data> implements InterfaceC2097d<Data> {

        /* JADX INFO: renamed from: a */
        public final String f51137a;

        /* JADX INFO: renamed from: b */
        public final a<Data> f51138b;

        /* JADX INFO: renamed from: c */
        public ByteArrayInputStream f51139c;

        public b(String str, a<Data> aVar) {
            this.f51137a = str;
            this.f51138b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<Data> mo6269a() {
            this.f51138b.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
            try {
                a<Data> aVar = this.f51138b;
                ByteArrayInputStream byteArrayInputStream = this.f51139c;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
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

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamM18925a = ((c.a) this.f51138b).m18925a(this.f51137a);
                this.f51139c = byteArrayInputStreamM18925a;
                aVar.mo6278f(byteArrayInputStreamM18925a);
            } catch (IllegalArgumentException e10) {
                aVar.mo6277c(e10);
            }
        }
    }

    /* JADX INFO: renamed from: x5.d$c */
    public static final class c<Model> implements InterfaceC10091p<Model, InputStream> {

        /* JADX INFO: renamed from: a */
        public final a f51140a = new a();

        /* JADX INFO: renamed from: x5.d$c$a */
        public class a implements a<InputStream> {
            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            /* JADX INFO: renamed from: a */
            public final ByteArrayInputStream m18925a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Model, InputStream> mo18922c(C10094s c10094s) {
            return new C10079d(this.f51140a);
        }
    }

    public C10079d(c.a aVar) {
        this.f51136a = aVar;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<Data> mo18920b(Model model, int i10, int i11, C8735e c8735e) {
        return new InterfaceC10090o.a<>(new C7283d(model), new b(model.toString(), this.f51136a));
    }
}
