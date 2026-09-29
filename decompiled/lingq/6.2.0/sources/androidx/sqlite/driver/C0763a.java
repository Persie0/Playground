package androidx.sqlite.driver;

import java.io.IOException;
import java.util.Locale;
import p000.AbstractC3695vr;
import p000.bk8;
import p000.bo9;
import p000.co9;
import p000.fa4;
import p000.ik8;
import p000.jj5;
import p000.vk9;
import p000.xg3;

/* JADX INFO: renamed from: androidx.sqlite.driver.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0763a implements bk8 {

    /* JADX INFO: renamed from: a */
    public final xg3 f7069a;

    public C0763a(xg3 xg3Var) {
        xg3Var.getClass();
        this.f7069a = xg3Var;
    }

    @Override // p000.bk8
    /* JADX INFO: renamed from: S */
    public final boolean mo2872S() {
        return this.f7069a.m24493S();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7069a.close();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.bk8
    /* JADX INFO: renamed from: e0 */
    public final ik8 mo2873e0(String str) {
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation;
        int i;
        str.getClass();
        xg3 xg3Var = this.f7069a;
        jj5 jj5Var = null;
        if (!xg3Var.isOpen()) {
            AbstractC3695vr.m23485C(21, "connection is closed");
            throw null;
        }
        String upperCase = vk9.m23376L0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iM23388k0 = 0;
            loop0: while (iM23388k0 < length) {
                char cCharAt = upperCase.charAt(iM23388k0);
                if (fa4.m11651m(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iM23388k1 = iM23388k0 + 1;
                            if (upperCase.charAt(iM23388k1) == '*') {
                                do {
                                    iM23388k1 = vk9.m23388k0(upperCase, '*', iM23388k1 + 1, 4);
                                    if (iM23388k1 < 0) {
                                        break loop0;
                                    }
                                    i = iM23388k1 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iM23388k0 = iM23388k1 + 2;
                            }
                        }
                        i2 = iM23388k0;
                        break;
                    }
                    if (upperCase.charAt(iM23388k0 + 1) != '-') {
                        i2 = iM23388k0;
                        break;
                    }
                    iM23388k0 = vk9.m23388k0(upperCase, '\n', iM23388k0 + 2, 4);
                    if (iM23388k0 < 0) {
                        break;
                    }
                }
                iM23388k0++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new bo9(xg3Var, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    supportSQLiteStatement$Companion$TransactionOperation = null;
                } else if (!vk9.m23380c0(upperCase, "EXCLUSIVE", false)) {
                    supportSQLiteStatement$Companion$TransactionOperation = !vk9.m23380c0(upperCase, "IMMEDIATE", false) ? SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_DEFERRED : SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_IMMEDIATE;
                } else {
                    supportSQLiteStatement$Companion$TransactionOperation = SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_EXCLUSIVE;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    supportSQLiteStatement$Companion$TransactionOperation = null;
                } else {
                    supportSQLiteStatement$Companion$TransactionOperation = SupportSQLiteStatement$Companion$TransactionOperation.END;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    supportSQLiteStatement$Companion$TransactionOperation = null;
                } else {
                    supportSQLiteStatement$Companion$TransactionOperation = SupportSQLiteStatement$Companion$TransactionOperation.END;
                }
                break;
            case 81327:
                supportSQLiteStatement$Companion$TransactionOperation = (!strSubstring.equals("ROL") || vk9.m23380c0(upperCase, " TO ", false)) ? null : SupportSQLiteStatement$Companion$TransactionOperation.ROLLBACK;
                break;
            default:
                supportSQLiteStatement$Companion$TransactionOperation = null;
                break;
        }
        if (supportSQLiteStatement$Companion$TransactionOperation != null) {
            return new C0765c(xg3Var, str, supportSQLiteStatement$Companion$TransactionOperation);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (vk9.m23380c0(vk9.m23368D0(lowerCase, "journal_mode", ""), "=", false)) {
                jj5Var = jj5.f45615f;
            }
        }
        if (jj5Var != null) {
            return new bo9(xg3Var, str, new co9(xg3Var, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new bo9(xg3Var, str) : new co9(xg3Var, str);
    }
}
