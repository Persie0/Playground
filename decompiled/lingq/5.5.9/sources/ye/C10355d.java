package ye;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.C3217b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p458we.InterfaceC9912a;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;
import ve.InterfaceC9715e;

/* JADX INFO: renamed from: ye.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10355d {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, InterfaceC9713c<?>> f52061a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, InterfaceC9715e<?>> f52062b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9713c<Object> f52063c;

    /* JADX INFO: renamed from: ye.d$a */
    public static final class a implements InterfaceC9912a<a> {

        /* JADX INFO: renamed from: a */
        public static final C10354c f52064a = new InterfaceC9713c() { // from class: ye.c
            @Override // ve.InterfaceC9711a
            /* JADX INFO: renamed from: a */
            public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) {
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            }
        };
    }

    public C10355d(HashMap map, HashMap map2, C10354c c10354c) {
        this.f52061a = map;
        this.f52062b = map2;
        this.f52063c = c10354c;
    }

    /* JADX INFO: renamed from: a */
    public final void m19368a(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        Map<Class<?>, InterfaceC9713c<?>> map = this.f52061a;
        C3217b c3217b = new C3217b(byteArrayOutputStream, map, this.f52062b, this.f52063c);
        if (obj == null) {
            return;
        }
        InterfaceC9713c<?> interfaceC9713c = map.get(obj.getClass());
        if (interfaceC9713c != null) {
            interfaceC9713c.mo6757a(obj, c3217b);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
