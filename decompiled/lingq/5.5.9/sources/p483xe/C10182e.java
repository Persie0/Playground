package p483xe;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p458we.InterfaceC9912a;
import ve.InterfaceC9713c;
import ve.InterfaceC9715e;
import ve.InterfaceC9716f;

/* JADX INFO: renamed from: xe.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10182e implements InterfaceC9912a<C10182e> {

    /* JADX INFO: renamed from: e */
    public static final C10178a f51499e = new C10178a(0);

    /* JADX INFO: renamed from: f */
    public static final C10179b f51500f = new InterfaceC9715e() { // from class: xe.b
        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9716f interfaceC9716f) throws IOException {
            interfaceC9716f.mo18218e((String) obj);
        }
    };

    /* JADX INFO: renamed from: g */
    public static final C10180c f51501g = new InterfaceC9715e() { // from class: xe.c
        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9716f interfaceC9716f) throws IOException {
            interfaceC9716f.mo18219f(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h */
    public static final a f51502h = new a();

    /* JADX INFO: renamed from: a */
    public final HashMap f51503a;

    /* JADX INFO: renamed from: b */
    public final HashMap f51504b;

    /* JADX INFO: renamed from: c */
    public final C10178a f51505c;

    /* JADX INFO: renamed from: d */
    public boolean f51506d;

    /* JADX INFO: renamed from: xe.e$a */
    public static final class a implements InterfaceC9715e<Date> {

        /* JADX INFO: renamed from: a */
        public static final SimpleDateFormat f51507a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f51507a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9716f interfaceC9716f) throws IOException {
            interfaceC9716f.mo18218e(f51507a.format((Date) obj));
        }
    }

    public C10182e() {
        HashMap map = new HashMap();
        this.f51503a = map;
        HashMap map2 = new HashMap();
        this.f51504b = map2;
        this.f51505c = f51499e;
        this.f51506d = false;
        map2.put(String.class, f51500f);
        map.remove(String.class);
        map2.put(Boolean.class, f51501g);
        map.remove(Boolean.class);
        map2.put(Date.class, f51502h);
        map.remove(Date.class);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC9912a m19193a(Class cls, InterfaceC9713c interfaceC9713c) {
        this.f51503a.put(cls, interfaceC9713c);
        this.f51504b.remove(cls);
        return this;
    }
}
