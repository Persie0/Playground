package p080e;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import cc.C1860k3;
import cc.C1897o4;
import com.google.android.play.core.assetpacks.C3112c;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p082e1.C5352b;
import p338qd.C8586v1;
import p338qd.ServiceConnectionC8552k0;
import p406u4.InterfaceC9436t;
import p457wd.InterfaceC9901b;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: e.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5288t implements InterfaceC9436t, InterfaceC9271s, InterfaceC9901b {

    /* JADX INFO: renamed from: c */
    public static Class f33496c;

    /* JADX INFO: renamed from: d */
    public static boolean f33497d;

    /* JADX INFO: renamed from: e */
    public static Method f33498e;

    /* JADX INFO: renamed from: f */
    public static boolean f33499f;

    /* JADX INFO: renamed from: g */
    public static Method f33500g;

    /* JADX INFO: renamed from: h */
    public static boolean f33501h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33502a;

    /* JADX INFO: renamed from: b */
    public Object f33503b;

    public C5288t(int i10) {
        this.f33502a = i10;
        if (i10 == 1) {
            this.f33503b = new ArrayList();
        } else if (i10 != 5) {
            this.f33503b = new ArrayDeque();
        } else {
            this.f33503b = new HashMap();
        }
    }

    public C5288t(int i10, int i11) {
        this.f33502a = 3;
        C5352b[] c5352bArr = new C5352b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            c5352bArr[i12] = new C5352b(i11, 0);
        }
        this.f33503b = c5352bArr;
    }

    public /* synthetic */ C5288t(int i10, Object obj) {
        this.f33502a = i10;
        this.f33503b = obj;
    }

    public C5288t(C1897o4 c1897o4) {
        this.f33502a = 6;
        this.f33503b = c1897o4;
    }

    public C5288t(String str) {
        this.f33502a = 10;
        this.f33503b = str;
    }

    @Override // p457wd.InterfaceC9901b
    /* JADX INFO: renamed from: a */
    public final void mo11402a(Object obj) {
        C3112c c3112c = (C3112c) this.f33503b;
        List list = (List) obj;
        int iM16652a = c3112c.f15907b.m16652a();
        while (true) {
            for (File file : c3112c.m8971e()) {
                if (!list.contains(file.getName()) && C3112c.m8965b(file, true) != iM16652a) {
                    C3112c.m8967g(file);
                }
            }
            return;
        }
    }

    @Override // p406u4.InterfaceC9436t
    /* JADX INFO: renamed from: b */
    public final void mo11403b(ViewGroup viewGroup, View view) {
    }

    /* JADX INFO: renamed from: c */
    public final float m11404c(int i10, int i11) {
        return ((Float[]) ((C5352b[]) this.f33503b)[i10].f33657b)[i11].floatValue();
    }

    /* JADX INFO: renamed from: d */
    public final C5352b m11405d(int i10) {
        return ((C5352b[]) this.f33503b)[i10];
    }

    /* JADX INFO: renamed from: e */
    public final Object m11406e() {
        Object obj = this.f33503b;
        return ((ArrayList) obj).remove(((ArrayList) obj).size() - 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m11407f(Object obj) {
        ((ArrayList) this.f33503b).add(obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m11408g(float f3, int i10, int i11) {
        ((Float[]) ((C5352b[]) this.f33503b)[i10].f33657b)[i11] = Float.valueOf(f3);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11409h() {
        if (TextUtils.isEmpty(((C1897o4) this.f33503b).f10078b)) {
            C1860k3 c1860k3 = ((C1897o4) this.f33503b).f10086i;
            C1897o4.m5776k(c1860k3);
            if (Log.isLoggable(c1860k3.m5709u(), 3)) {
                return true;
            }
        }
        return false;
    }

    @Override // p406u4.InterfaceC9436t
    public final void setVisibility(int i10) {
        ((View) this.f33503b).setVisibility(i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        switch (this.f33502a) {
            case 10:
                return (String) this.f33503b;
            default:
                return super.toString();
        }
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        return new ServiceConnectionC8552k0(((C8586v1) ((InterfaceC9271s) this.f33503b)).m16807a());
    }
}
