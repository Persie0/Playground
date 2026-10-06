package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C1164yz implements InterfaceC1162yx {

    /* JADX INFO: renamed from: d */
    final AbstractC1174zi f48308d;

    /* JADX INFO: renamed from: e */
    int f48309e;

    /* JADX INFO: renamed from: f */
    public int f48310f;

    /* JADX INFO: renamed from: a */
    public InterfaceC1162yx f48305a = null;

    /* JADX INFO: renamed from: b */
    public boolean f48306b = false;

    /* JADX INFO: renamed from: c */
    public boolean f48307c = false;

    /* JADX INFO: renamed from: l */
    int f48316l = 1;

    /* JADX INFO: renamed from: g */
    int f48311g = 1;

    /* JADX INFO: renamed from: h */
    C1166za f48312h = null;

    /* JADX INFO: renamed from: i */
    public boolean f48313i = false;

    /* JADX INFO: renamed from: j */
    final List f48314j = new ArrayList();

    /* JADX INFO: renamed from: k */
    final List f48315k = new ArrayList();

    public C1164yz(AbstractC1174zi abstractC1174zi) {
        this.f48308d = abstractC1174zi;
    }

    /* JADX INFO: renamed from: a */
    public final void m19738a(InterfaceC1162yx interfaceC1162yx) {
        this.f48314j.add(interfaceC1162yx);
        if (this.f48313i) {
            interfaceC1162yx.mo19730f();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19739b() {
        this.f48315k.clear();
        this.f48314j.clear();
        this.f48313i = false;
        this.f48310f = 0;
        this.f48307c = false;
        this.f48306b = false;
    }

    /* JADX INFO: renamed from: c */
    public void mo19740c(int i) {
        if (this.f48313i) {
            return;
        }
        this.f48313i = true;
        this.f48310f = i;
        Iterator it = this.f48314j.iterator();
        while (it.hasNext()) {
            ((InterfaceC1162yx) it.next()).mo19730f();
        }
    }

    @Override // p000.InterfaceC1162yx
    /* JADX INFO: renamed from: f */
    public final void mo19730f() {
        Iterator it = this.f48315k.iterator();
        while (it.hasNext()) {
            if (!((C1164yz) it.next()).f48313i) {
                return;
            }
        }
        this.f48307c = true;
        InterfaceC1162yx interfaceC1162yx = this.f48305a;
        if (interfaceC1162yx != null) {
            interfaceC1162yx.mo19730f();
        }
        if (this.f48306b) {
            this.f48308d.mo19730f();
            return;
        }
        int i = 0;
        C1164yz c1164yz = null;
        for (C1164yz c1164yz2 : this.f48315k) {
            if (!(c1164yz2 instanceof C1166za)) {
                i++;
                c1164yz = c1164yz2;
            }
        }
        if (c1164yz != null && i == 1 && c1164yz.f48313i) {
            C1166za c1166za = this.f48312h;
            if (c1166za != null) {
                if (!c1166za.f48313i) {
                    return;
                } else {
                    this.f48309e = this.f48311g * c1166za.f48310f;
                }
            }
            mo19740c(c1164yz.f48310f + this.f48309e);
        }
        InterfaceC1162yx interfaceC1162yx2 = this.f48305a;
        if (interfaceC1162yx2 != null) {
            interfaceC1162yx2.mo19730f();
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f48308d.f48342d.f48221aj);
        sb.append(":");
        switch (this.f48316l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append(hsSUWRJfoeC.jFd);
        sb.append(this.f48313i ? Integer.valueOf(this.f48310f) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f48315k.size());
        sb.append(":d=");
        sb.append(this.f48314j.size());
        sb.append(">");
        return sb.toString();
    }
}
