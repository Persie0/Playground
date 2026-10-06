package p000;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class abl {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m132a(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }

    /* JADX INFO: renamed from: b */
    static Notification.Builder m133b(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }
}
