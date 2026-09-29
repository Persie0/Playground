package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzs;
import com.lingq.feature.imports.C2104a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class gx9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41507a;

    /* JADX INFO: renamed from: b */
    public final Object f41508b;

    public gx9(C2104a c2104a) {
        this.f41507a = 2;
        jmb jmbVar = new jmb(c2104a.f26147a, new zzam(null));
        jh9 jh9Var = new jh9(jmbVar, 1);
        if (jmbVar.m14535b() != null) {
            this.f41508b = jh9Var;
        } else {
            C3386nv.m17626m("GMS recognizer not operational");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m12964a(Bitmap bitmap, Continuation continuation) throws Throwable {
        Bitmap bitmapCreateBitmap;
        zzah[] zzahVarArr;
        String string;
        Rect rect;
        int i;
        int i2 = this.f41507a;
        int i3 = 28;
        Object obj = this.f41508b;
        switch (i2) {
            case 0:
                jk8 jk8Var = new jk8(AbstractC3584sr.m21600K(continuation), CoroutineSingletons.UNDECIDED);
                tld tldVarM14758p = ((l3d) obj).m14758p(bitmap);
                hi8 hi8Var = new hi8(new fx9(jk8Var, 0), i3);
                tldVarM14758p.getClass();
                tldVarM14758p.mo5963e(xr9.f68587a, hi8Var);
                tldVarM14758p.mo5961c(new web(jk8Var));
                return jk8Var.m14527a();
            case 1:
                jk8 jk8Var2 = new jk8(AbstractC3584sr.m21600K(continuation), CoroutineSingletons.UNDECIDED);
                tld tldVarM14758p2 = ((l3d) obj).m14758p(bitmap);
                hi8 hi8Var2 = new hi8(new fx9(jk8Var2, 1), i3);
                tldVarM14758p2.getClass();
                tldVarM14758p2.mo5963e(xr9.f68587a, hi8Var2);
                tldVarM14758p2.mo5961c(new vf9(jk8Var2));
                return jk8Var2.m14527a();
            default:
                qg3 qg3Var = new qg3();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                qg3Var.f57750a = width;
                qg3Var.f57751b = height;
                jh9 jh9Var = (jh9) obj;
                jh9Var.getClass();
                Rect rect2 = new Rect();
                zzaj zzajVar = new zzaj(rect2);
                zzs zzsVar = new zzs();
                zzsVar.f12301a = qg3Var.f57750a;
                zzsVar.f12302b = qg3Var.f57751b;
                zzsVar.f12305e = 0;
                zzsVar.f12303c = 0;
                zzsVar.f12304d = 0L;
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                if (zzsVar.f12305e != 0) {
                    Matrix matrix = new Matrix();
                    int i4 = zzsVar.f12305e;
                    if (i4 == 0) {
                        i = 0;
                    } else if (i4 == 1) {
                        i = 90;
                    } else if (i4 == 2) {
                        i = 180;
                    } else {
                        if (i4 != 3) {
                            C3386nv.m17626m("Unsupported rotation degree.");
                            return null;
                        }
                        i = 270;
                    }
                    matrix.postRotate(i);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, false);
                } else {
                    bitmapCreateBitmap = bitmap;
                }
                int i5 = zzsVar.f12305e;
                if (i5 == 1 || i5 == 3) {
                    zzsVar.f12301a = height2;
                    zzsVar.f12302b = width2;
                }
                if (!rect2.isEmpty()) {
                    int i6 = qg3Var.f57750a;
                    int i7 = qg3Var.f57751b;
                    int i8 = zzsVar.f12305e;
                    if (i8 == 1) {
                        rect = new Rect(i7 - rect2.bottom, rect2.left, i7 - rect2.top, rect2.right);
                    } else if (i8 != 2) {
                        rect = i8 != 3 ? rect2 : new Rect(rect2.top, i6 - rect2.right, rect2.bottom, i6 - rect2.left);
                    } else {
                        rect = new Rect(i6 - rect2.right, i7 - rect2.bottom, i6 - rect2.left, i7 - rect2.top);
                    }
                    rect2.set(rect);
                }
                zzsVar.f12305e = 0;
                jmb jmbVar = (jmb) jh9Var.f45552b;
                if (jmbVar.m14535b() != null) {
                    try {
                        lp6 lp6Var = new lp6(bitmapCreateBitmap);
                        ahb ahbVar = (ahb) jmbVar.m14535b();
                        lda.m16130p(ahbVar);
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken(ahbVar.f51090h);
                        int i9 = iwb.f44718a;
                        parcelObtain.writeStrongBinder(lp6Var);
                        parcelObtain.writeInt(1);
                        zzsVar.writeToParcel(parcelObtain, 0);
                        parcelObtain.writeInt(1);
                        zzajVar.writeToParcel(parcelObtain, 0);
                        Parcel parcelM16774K = ahbVar.m16774K(parcelObtain, 3);
                        zzahVarArr = (zzah[]) parcelM16774K.createTypedArray(zzah.CREATOR);
                        parcelM16774K.recycle();
                    } catch (RemoteException e) {
                        Log.e("TextNativeHandle", "Error calling native text recognizer", e);
                        zzahVarArr = new zzah[0];
                    }
                    break;
                } else {
                    zzahVarArr = new zzah[0];
                }
                SparseArray sparseArray = new SparseArray();
                for (zzah zzahVar : zzahVarArr) {
                    SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzahVar.f12282j);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        sparseArray.append(zzahVar.f12282j, sparseArray2);
                    }
                    sparseArray2.append(zzahVar.f12283k, zzahVar);
                }
                SparseArray sparseArray3 = new SparseArray(sparseArray.size());
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    int iKeyAt = sparseArray.keyAt(i10);
                    SparseArray sparseArray4 = (SparseArray) sparseArray.valueAt(i10);
                    ws9 ws9Var = new ws9();
                    ws9Var.f67258a = new zzah[sparseArray4.size()];
                    int i11 = 0;
                    while (true) {
                        zzah[] zzahVarArr2 = ws9Var.f67258a;
                        if (i11 < zzahVarArr2.length) {
                            zzahVarArr2[i11] = (zzah) sparseArray4.valueAt(i11);
                            i11++;
                        }
                    }
                    sparseArray3.append(iKeyAt, ws9Var);
                }
                StringBuilder sb = new StringBuilder();
                int size = sparseArray3.size();
                for (int i12 = 0; i12 < size; i12++) {
                    zzah[] zzahVarArr3 = ((ws9) sparseArray3.valueAt(i12)).f67258a;
                    if (zzahVarArr3.length == 0) {
                        string = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(zzahVarArr3[0].f12277e);
                        for (int i13 = 1; i13 < zzahVarArr3.length; i13++) {
                            sb2.append("\n");
                            sb2.append(zzahVarArr3[i13].f12277e);
                        }
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append('\n');
                }
                return sb.toString();
        }
    }

    public gx9(l3d l3dVar) {
        this.f41507a = 1;
        this.f41508b = l3dVar;
    }

    public gx9() {
        this.f41507a = 0;
        this.f41508b = a7d.m167a(ix9.f44745c);
    }
}
