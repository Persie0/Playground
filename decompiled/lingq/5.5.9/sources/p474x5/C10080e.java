package p474x5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.IOException;
import java.io.InputStream;
import p042c6.C1730b;
import p042c6.C1733e;
import p236l6.C7283d;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10080e<DataT> implements InterfaceC10090o<Integer, DataT> {

    /* JADX INFO: renamed from: a */
    public final Context f51141a;

    /* JADX INFO: renamed from: b */
    public final e<DataT> f51142b;

    /* JADX INFO: renamed from: x5.e$a */
    public static final class a implements InterfaceC10091p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Context f51143a;

        public a(Context context) {
            this.f51143a = context;
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: a */
        public final Class<AssetFileDescriptor> mo18926a() {
            return AssetFileDescriptor.class;
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: b */
        public final void mo18927b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Integer, AssetFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10080e(this.f51143a, this);
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: d */
        public final Object mo18928d(Resources resources, int i10, Resources.Theme theme) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* JADX INFO: renamed from: x5.e$b */
    public static final class b implements InterfaceC10091p<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a */
        public final Context f51144a;

        public b(Context context) {
            this.f51144a = context;
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: a */
        public final Class<Drawable> mo18926a() {
            return Drawable.class;
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18927b(Drawable drawable) throws IOException {
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Integer, Drawable> mo18922c(C10094s c10094s) {
            return new C10080e(this.f51144a, this);
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: d */
        public final Object mo18928d(Resources resources, int i10, Resources.Theme theme) {
            Context context = this.f51144a;
            return C1730b.m5469a(context, context, i10, theme);
        }
    }

    /* JADX INFO: renamed from: x5.e$c */
    public static final class c implements InterfaceC10091p<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f51145a;

        public c(Context context) {
            this.f51145a = context;
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: a */
        public final Class<InputStream> mo18926a() {
            return InputStream.class;
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: b */
        public final void mo18927b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Integer, InputStream> mo18922c(C10094s c10094s) {
            return new C10080e(this.f51145a, this);
        }

        @Override // p474x5.C10080e.e
        /* JADX INFO: renamed from: d */
        public final Object mo18928d(Resources resources, int i10, Resources.Theme theme) {
            return resources.openRawResource(i10);
        }
    }

    /* JADX INFO: renamed from: x5.e$d */
    public static final class d<DataT> implements InterfaceC2097d<DataT> {

        /* JADX INFO: renamed from: a */
        public final Resources.Theme f51146a;

        /* JADX INFO: renamed from: b */
        public final Resources f51147b;

        /* JADX INFO: renamed from: c */
        public final e<DataT> f51148c;

        /* JADX INFO: renamed from: d */
        public final int f51149d;

        /* JADX INFO: renamed from: e */
        public DataT f51150e;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f51146a = theme;
            this.f51147b = resources;
            this.f51148c = eVar;
            this.f51149d = i10;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<DataT> mo6269a() {
            return this.f51148c.mo18926a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
            DataT datat = this.f51150e;
            if (datat != null) {
                try {
                    this.f51148c.mo18927b(datat);
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

        /* JADX WARN: Type inference failed for: r8v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super DataT> aVar) {
            try {
                ?? r10 = (DataT) this.f51148c.mo18928d(this.f51147b, this.f51149d, this.f51146a);
                this.f51150e = r10;
                aVar.mo6278f(r10);
            } catch (Resources.NotFoundException e10) {
                aVar.mo6277c(e10);
            }
        }
    }

    /* JADX INFO: renamed from: x5.e$e */
    public interface e<DataT> {
        /* JADX INFO: renamed from: a */
        Class<DataT> mo18926a();

        /* JADX INFO: renamed from: b */
        void mo18927b(DataT datat) throws IOException;

        /* JADX INFO: renamed from: d */
        Object mo18928d(Resources resources, int i10, Resources.Theme theme);
    }

    public C10080e(Context context, e<DataT> eVar) {
        this.f51141a = context.getApplicationContext();
        this.f51142b = eVar;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18919a(Integer num) {
        return true;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(Integer num, int i10, int i11, C8735e c8735e) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) c8735e.m16963c(C1733e.f9578b);
        return new InterfaceC10090o.a(new C7283d(num2), new d(theme, theme != null ? theme.getResources() : this.f51141a.getResources(), this.f51142b, num2.intValue()));
    }
}
