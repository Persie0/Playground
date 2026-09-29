package p000;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;

/* JADX INFO: renamed from: e0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2947e0 {
    /* JADX INFO: renamed from: a */
    public abstract pl0 mo4679a();

    /* JADX INFO: renamed from: b */
    public abstract nm1 mo4680b();

    /* JADX INFO: renamed from: c */
    public final Object m10763c(CharSequence charSequence) {
        String str;
        charSequence.getClass();
        try {
            t47 t47Var = mo4679a().f56396c;
            t47Var.getClass();
            try {
                return mo4681d(jzb.m14756a(t47Var, charSequence, mo4680b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new DateTimeFormatException(str, e);
            }
        } catch (ParseException e2) {
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + '\'', e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo4681d(nm1 nm1Var);
}
