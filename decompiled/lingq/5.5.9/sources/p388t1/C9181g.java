package p388t1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p081e0.InterfaceC5301c1;
import p290o6.C7986y;
import p372rm.InterfaceC8836f;
import sl.C9072e;

/* JADX INFO: renamed from: t1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9181g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47720a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f47721b;

    /* JADX INFO: renamed from: c */
    public final Object f47722c;

    /* JADX INFO: renamed from: d */
    public final Object f47723d;

    public C9181g(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C7986y c7986y) {
        this.f47723d = context;
        this.f47722c = cleverTapInstanceConfig;
        this.f47721b = c7986y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9181g(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        C5207g.m11111f(intent, "intent");
    }

    public C9181g(Uri uri, String str, String str2) {
        this.f47721b = uri;
        this.f47722c = str;
        this.f47723d = str2;
    }

    public C9181g(InterfaceC5301c1 interfaceC5301c1, C9181g c9181g) {
        C5207g.m11111f(interfaceC5301c1, "resolveResult");
        this.f47721b = interfaceC5301c1;
        this.f47722c = c9181g;
        this.f47723d = interfaceC5301c1.getValue();
    }

    public C9181g(String str) {
        C5207g.m11112g(str, "namespace");
        this.f47722c = str;
        this.f47723d = new Object();
        this.f47721b = new LinkedHashMap();
    }

    public C9181g(InterfaceC8836f interfaceC8836f, List list, C9181g c9181g) {
        C5207g.m11111f(interfaceC8836f, "classifierDescriptor");
        C5207g.m11111f(list, "arguments");
        this.f47721b = interfaceC8836f;
        this.f47722c = list;
        this.f47723d = c9181g;
    }

    /* JADX INFO: renamed from: a */
    public final void m17512a() {
        synchronized (this.f47723d) {
            ((Map) this.f47721b).clear();
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17513b() {
        if (((InterfaceC5301c1) this.f47721b).getValue() == this.f47723d) {
            Object obj = this.f47722c;
            if (((C9181g) obj) == null || !((C9181g) obj).m17513b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m17514c(int i10) {
        synchronized (this.f47723d) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        switch (this.f47720a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f47721b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                String str = (String) this.f47722c;
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
                String str2 = (String) this.f47723d;
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                String string = sb2.toString();
                C5207g.m11110e(string, "sb.toString()");
                return string;
            default:
                return super.toString();
        }
    }
}
