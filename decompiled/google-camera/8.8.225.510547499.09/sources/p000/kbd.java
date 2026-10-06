package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.support.v7.widget.RecyclerView;
import android.util.Size;
import android.view.View;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbd {
    /* JADX INFO: renamed from: a */
    public static Size m13912a(kbc kbcVar) {
        return new Size(kbcVar.f35517a, kbcVar.f35518b);
    }

    /* JADX INFO: renamed from: b */
    public static kbc m13913b(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            return new kbc(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static kbc m13914c(List list) {
        lku.m15613H(!list.isEmpty());
        return (kbc) Collections.max(list, C1143ye.f48118b);
    }

    /* JADX INFO: renamed from: d */
    public static String m13915d(kbc kbcVar) {
        return kbcVar.f35517a + "x" + kbcVar.f35518b;
    }

    /* JADX INFO: renamed from: e */
    public static List m13916e(Size[] sizeArr) {
        if (sizeArr == null) {
            int i = mws.f41739d;
            return mzr.f41857a;
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            if (size != null) {
                arrayList.add(new kbc(size.getWidth(), size.getHeight()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m13917f(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    /* JADX INFO: renamed from: g */
    public static final String m13918g(kmg kmgVar) {
        kmgVar.getClass();
        String str = kmgVar.f36540a;
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m13919h(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "CLOSED";
            case 4:
                return "PAUSED";
            default:
                return VzWFSVj.ieBYtjAAatHrEP;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m13920i(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "CLOSED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m13921j(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "STOPPED";
            case 4:
                return "CLOSED";
            case 5:
                return "PAUSED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: k */
    public static Point m13922k(AbstractC0812ly abstractC0812ly, View view) {
        if (abstractC0812ly == null) {
            return new Point(0, 0);
        }
        Rect rect = new Rect();
        abstractC0812ly.m16145aB(view, rect);
        return new Point((rect.left - rect.right) / 2, (rect.top - rect.bottom) / 2);
    }

    /* JADX INFO: renamed from: l */
    public static int m13923l(iyb iybVar, RecyclerView recyclerView, boolean z) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0 && iybVar.mo11895g(recyclerView.getChildAt(0))) {
            return 0;
        }
        if (z) {
            return iybVar.mo11892d(recyclerView) / 2;
        }
        if (childCount == 0) {
            return 0;
        }
        int iMax = -2147483647;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int iMo11890b = iybVar.mo11890b(childAt);
            int iMo11892d = iybVar.mo11892d(childAt) / 2;
            iMin = Math.min(iMin, iMo11890b - iMo11892d);
            iMax = Math.max(iMax, iMo11890b + iMo11892d);
        }
        return (iybVar.mo11892d(recyclerView) - (iMax - iMin)) / 2;
    }

    /* JADX INFO: renamed from: m */
    public static int[] m13924m() {
        return new int[]{1, 2};
    }

    /* JADX INFO: renamed from: n */
    public static String m13925n(ipk ipkVar) {
        return ipkVar.mo3652a().name();
    }

    /* JADX INFO: renamed from: o */
    public static int m13926o(ipk ipkVar, kpw kpwVar, kpw kpwVar2) {
        lby lbyVarMo3653b = ipkVar.mo3653b();
        if (lbyVarMo3653b == null) {
            throw new UnsupportedOperationException("unsupported process(ImageProxy, ImageProxy): GL context cannot be null");
        }
        HardwareBuffer hardwareBufferMo7250f = kpwVar.mo7250f();
        try {
            HardwareBuffer hardwareBufferMo7250f2 = kpwVar2.mo7250f();
            try {
                hardwareBufferMo7250f.getClass();
                EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                try {
                    hardwareBufferMo7250f2.getClass();
                    EGLImage eGLImage2 = new EGLImage(hardwareBufferMo7250f2);
                    try {
                        lcy lcyVarM15192b = lcy.m15192b(lbyVarMo3653b, eGLImage);
                        try {
                            ldx ldxVarM15220j = ldx.m15220j(lbyVarMo3653b, eGLImage2);
                            try {
                                kpwVar.mo7248d();
                                int iMo3665n = ipkVar.mo3665n(lcyVarM15192b, ldxVarM15220j);
                                ldxVarM15220j.close();
                                lcyVarM15192b.close();
                                eGLImage2.close();
                                eGLImage.close();
                                hardwareBufferMo7250f2.close();
                                hardwareBufferMo7250f.close();
                                return iMo3665n;
                            } catch (Throwable th) {
                                try {
                                    ldxVarM15220j.close();
                                } catch (Throwable th2) {
                                    m13929r(th, th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                lcyVarM15192b.close();
                            } catch (Throwable th4) {
                                m13929r(th3, th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            eGLImage2.close();
                        } catch (Throwable th6) {
                            m13929r(th5, th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        eGLImage.close();
                    } catch (Throwable th8) {
                        m13929r(th7, th8);
                    }
                    throw th7;
                }
            } catch (Throwable th9) {
                if (hardwareBufferMo7250f2 != null) {
                    try {
                        hardwareBufferMo7250f2.close();
                    } catch (Throwable th10) {
                        m13929r(th9, th10);
                    }
                }
                throw th9;
            }
        } catch (Throwable th11) {
            if (hardwareBufferMo7250f != null) {
                try {
                    hardwareBufferMo7250f.close();
                } catch (Throwable th12) {
                    m13929r(th11, th12);
                }
            }
            throw th11;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m13927p(ipk ipkVar, key keyVar, kgg kggVar, key keyVar2) {
        kpw kpwVarMo7043d = keyVar.mo7043d(kggVar);
        try {
            kpw kpwVarMo7043d2 = keyVar2.mo7043d(kggVar);
            try {
                kpwVarMo7043d.getClass();
                kpwVarMo7043d2.getClass();
                int iMo3663l = ipkVar.mo3663l(kpwVarMo7043d, kpwVarMo7043d2);
                kpwVarMo7043d2.close();
                kpwVarMo7043d.close();
                return iMo3663l;
            } catch (Throwable th) {
                if (kpwVarMo7043d2 != null) {
                    try {
                        kpwVarMo7043d2.close();
                    } catch (Throwable th2) {
                        m13929r(th, th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (kpwVarMo7043d != null) {
                try {
                    kpwVarMo7043d.close();
                } catch (Throwable th4) {
                    m13929r(th3, th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m13928q() {
        throw new UnsupportedOperationException("unsupported process(GLExternalTexture, GLCanvas)");
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m13929r(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception e) {
        }
    }
}
