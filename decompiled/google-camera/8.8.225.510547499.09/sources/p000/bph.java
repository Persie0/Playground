package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bph extends bpf {
    public bph(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls.toString() + hiCTUJiAxf.dKd + cls2.toString());
    }

    public bph(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public bph(Object obj, List list) {
        super("Found ModelLoaders for model class: " + String.valueOf(list) + ", but none that handle this specific model instance: " + String.valueOf(obj));
    }
}
