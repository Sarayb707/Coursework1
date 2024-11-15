int[] average_grades(int[][] grades, int[] weights) {
    int[] weightedAverages = new int[grades.length];

    for (int i = 0; i < grades.length; i++) {
        int weightedSum = 0;

        for (int j = 0; j < grades[i].length; j++) {
            weightedSum += grades[i][j] * weights[j];
        }

        weightedAverages[i] = weightedSum / 100;  // Integer division automatically rounds down
    }

    return weightedAverages;
}

average_grades(grades, weights)
