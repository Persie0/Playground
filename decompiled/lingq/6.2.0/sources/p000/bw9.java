package p000;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.AbstractC1110a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class bw9 extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f9104b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList f9105c;

    /* JADX WARN: Multi-variable type inference failed */
    public bw9(String str, String str2, List list) {
        super(str);
        bna.m3969q(!((AbstractCollection) list).isEmpty());
        this.f9104b = str2;
        ImmutableList immutableListM6287r = ImmutableList.m6287r(list);
        this.f9105c = immutableListM6287r;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m4206d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.dy5
    /* JADX INFO: renamed from: b */
    public final void mo4207b(su5 su5Var) {
        byte b;
        switch (this.f7687a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        ImmutableList immutableList = this.f9105c;
        try {
            switch (b) {
                case 0:
                case 10:
                    su5Var.f61420c = (CharSequence) immutableList.get(0);
                    break;
                case 1:
                case 11:
                    su5Var.f61436s = (CharSequence) immutableList.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) immutableList.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    su5Var.f61430m = Integer.valueOf(i);
                    su5Var.f61431n = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    su5Var.f61419b = (CharSequence) immutableList.get(0);
                    break;
                case 4:
                case 19:
                    su5Var.f61421d = (CharSequence) immutableList.get(0);
                    break;
                case 5:
                case 20:
                    su5Var.f61437t = (CharSequence) immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) immutableList.get(0);
                    String str3 = uma.f64080a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    su5Var.f61425h = Integer.valueOf(i3);
                    su5Var.f61426i = numValueOf;
                    break;
                case 7:
                case 17:
                    su5Var.f61418a = (CharSequence) immutableList.get(0);
                    break;
                case 8:
                case 16:
                    su5Var.f61435r = (CharSequence) immutableList.get(0);
                    break;
                case 9:
                case 22:
                    su5Var.f61429l = Integer.valueOf(Integer.parseInt((String) immutableList.get(0)));
                    break;
                case 12:
                    Integer numM6367g = AbstractC1110a.m6367g((String) immutableList.get(0));
                    if (numM6367g != null) {
                        String strM4238a = bz3.m4238a(numM6367g.intValue());
                        if (strM4238a != null) {
                            su5Var.f61440w = strM4238a;
                        }
                    } else {
                        su5Var.f61440w = (CharSequence) immutableList.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListM4206d = m4206d((String) immutableList.get(0));
                    int size = arrayListM4206d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                su5Var.f61431n = (Integer) arrayListM4206d.get(2);
                            }
                        }
                        su5Var.f61430m = (Integer) arrayListM4206d.get(1);
                    }
                    su5Var.f61429l = (Integer) arrayListM4206d.get(0);
                    break;
                case 15:
                    ArrayList arrayListM4206d2 = m4206d((String) immutableList.get(0));
                    int size2 = arrayListM4206d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                su5Var.f61434q = (Integer) arrayListM4206d2.get(2);
                            }
                        }
                        su5Var.f61433p = (Integer) arrayListM4206d2.get(1);
                    }
                    su5Var.f61432o = (Integer) arrayListM4206d2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bw9.class != obj.getClass()) {
            return false;
        }
        bw9 bw9Var = (bw9) obj;
        return this.f7687a.equals(bw9Var.f7687a) && Objects.equals(this.f9104b, bw9Var.f9104b) && this.f9105c.equals(bw9Var.f9105c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(527, this.f7687a, 31);
        String str = this.f9104b;
        return this.f9105c.hashCode() + ((iM22980c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p000.az3
    public final String toString() {
        return this.f7687a + ": description=" + this.f9104b + ": values=" + this.f9105c;
    }
}
